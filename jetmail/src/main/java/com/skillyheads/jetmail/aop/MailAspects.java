package com.skillyheads.jetmail.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class MailAspects {
    Logger logger = LogManager.getLogger(MailAspects.class);
    @Around("execution(* *.sendMail(..))")
    public void checkEmail(ProceedingJoinPoint jp) throws Throwable {
        Object[] args = jp.getArgs();

        logger.info(Arrays.toString(args));
        jp.proceed();
        //
    }
}
