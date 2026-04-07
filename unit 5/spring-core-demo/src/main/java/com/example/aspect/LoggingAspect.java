package com.example.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.model.Student.show(..))")
    public void beforeMethod() {
        System.out.println("Before method execution (AOP)");
    }

    @After("execution(* com.example.model.Student.show(..))")
    public void afterMethod() {
        System.out.println("After method execution (AOP)");
    }
}