package com.jeeffy.demo.util;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by jiangfeng on 2017/8/15.
 */
public class TokenUtil {
    private static Logger log = LoggerFactory.getLogger(TokenUtil.class);

    private static Algorithm algorithm = null;

    static{
        try {
            algorithm = Algorithm.HMAC256("qgs-jwt-token");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    /**
     * 生成带有过期时间的token
     * @param json token需要包含的内容
     * @param expireSecond 过期时间(单位是分钟)
     * @return 生成的token
     */
    public static String generate(JSONObject json, int expireSecond){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.SECOND,expireSecond);

        String token = JWT.create()
                .withIssuer("qgs")
                .withSubject(json.toString())
                .withExpiresAt(calendar.getTime())
                .sign(algorithm);
        return token;
    }

    /**
     * 验证token是否有效
     * @param token
     * @return 验证结果
     */
    public static boolean verify(String token){
        try{
            if (token==null){
                return false;
            }else {
                JWTVerifier verifier = JWT.require(algorithm)
                        .withIssuer("qgs")
                        .build();
                verifier.verify(token);
            }

        }catch (JWTVerificationException ex){
            log.warn(ex.getMessage());
            return false;
        }
        return true;
    }

    /**
     * 获取token的内容
     * @param token
     * @return 保持在token中的内容
     */
    public static JSONObject getContent(String token){
        JWTVerifier verifier = JWT.require(algorithm)
                .withIssuer("qgs")
                .build();
        DecodedJWT jwt = verifier.verify(token);
        return JSONObject.parseObject(jwt.getSubject());
    }

    /**
     * 更新token的过期时间
     * @param token
     * @param expireSecond
     * @return 更新后的token
     */
    public static String refresh(String token, int expireSecond){
        JSONObject json = getContent(token);
        return generate(json, expireSecond);
    }

}
