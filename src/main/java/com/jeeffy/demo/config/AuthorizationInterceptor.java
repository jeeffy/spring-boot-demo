package com.jeeffy.demo.config;

import com.jeeffy.demo.util.TokenUtil;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Component
@ConfigurationProperties(prefix="authorization")
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {
    private List<String> excludePaths;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String requestUri = request.getRequestURI();
        String contextPath = request.getContextPath();
        String url = requestUri.substring(contextPath.length());
        if (excludes(url)) {
            return true;
        } else {
            String token = request.getHeader("token");
            if (StringUtils.isEmpty(token)) {
                token = request.getParameter("token");
            }
            boolean valid = TokenUtil.verify(token);
            if (valid) {
                return true;
            } else {
                response.setContentType("application/json;charset=UTF-8");
                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                response.getWriter().write("{\"status\":401,\"message\":\"没有授权或token过期，请重新登录。\"}");
                return false;
            }
        }
    }

    private boolean excludes(String url) {
        PathMatcher matcher = new AntPathMatcher();
        for (String path : excludePaths) {
            if (matcher.match(path, url)) {
                return true;
            }
        }
        return false;
    }

    public List<String> getExcludePaths() {
        return excludePaths;
    }

    public void setExcludePaths(List<String> excludePaths) {
        this.excludePaths = excludePaths;
    }
}
