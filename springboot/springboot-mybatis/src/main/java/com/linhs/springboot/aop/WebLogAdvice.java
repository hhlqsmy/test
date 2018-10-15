package com.linhs.springboot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@Aspect
@Component
public class WebLogAdvice {

    private Logger logger = LoggerFactory.getLogger(WebLogAdvice.class);

    @Pointcut("execution(* com.linhs.springboot.controller..*.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String method = request.getMethod();
        StringBuffer url = request.getRequestURL();
        String ip = request.getLocalAddr();
        Enumeration<String> parameterNames = request.getParameterNames();
        logger.info("--------------request info------------------");
        logger.info("method:" + method);
        logger.info("url:" + url);
        logger.info("ip:" + ip);
        logger.info("--------------request parames------------------");
        while (parameterNames.hasMoreElements()){
            String name = parameterNames.nextElement();
            logger.info(name+":"+request.getParameter("name"));
        }
    }

    @AfterReturning(returning = "ret", pointcut = "pointcut()")
    public void doAfterReturning(Object ret) {
        logger.info("ret:" + ret);
    }

    @AfterThrowing(throwing = "ex",pointcut = "pointcut()")
    public void afterThrowing(Throwable ex) {
        logger.info("ex:" + ex);
    }
}
