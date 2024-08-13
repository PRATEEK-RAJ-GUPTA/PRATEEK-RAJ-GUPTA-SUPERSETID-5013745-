package com.library.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.library.service.BookService.performService(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before executing: " + joinPoint.getSignature().toShortString());
    }

    @After("execution(* com.library.service.BookService.performService(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("After executing: " + joinPoint.getSignature().toShortString());
    }
}
