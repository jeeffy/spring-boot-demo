package com.jeeffy.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(Exception.class)
    public void handleException(Exception ex, HttpServletRequest request, HttpServletResponse response) {
        try {
            logger.error("Exception from "+ex.getStackTrace()[0].getClassName(), ex);

            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.setContentType("application/json; charset=utf-8");
            PrintWriter out = response.getWriter();
            out.append("{\"status\":500,\"message\":\""+ ex.getMessage() +"\"}");
            out.close();
        } catch (Exception e) {
            logger.error("global handle exception",e);
        }
    }

}