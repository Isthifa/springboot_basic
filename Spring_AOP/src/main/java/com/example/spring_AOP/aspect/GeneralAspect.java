package com.example.spring_AOP.aspect;

import com.example.spring_AOP.entity.Topics;
import org.aspectj.lang.annotation.*;
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

    @AfterReturning(value = "execution(* com.example.spring_AOP.controller.*.*(..))",returning = "topics")
    public void afterReturning(Topics topics)
    {
        System.out.println("After Returning "+topics.getId());
    }

    @AfterThrowing(value = "execution(* com.example.spring_AOP.controller.*.*(..))",throwing = "e")
    public void afterThrowing(Exception e)
    {
        System.out.println("After Throwing = "+e.getMessage());
    }
}
