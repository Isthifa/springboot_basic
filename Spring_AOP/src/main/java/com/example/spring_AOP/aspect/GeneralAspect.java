package com.example.spring_AOP.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GeneralAspect {

    //AOP Advice Before
    @Before("execution(* com.example.spring_AOP.controller.*.*(..))")
    public void beforeAddvalue()
    {
        System.out.println("Executing @Before advice");
    }

    @After("execution(* com.example.spring_AOP.controller.*.*(..))")
    public void afterAddvalue()
    {
        System.out.println("Executing @After Advice");
    }
}
