package com.csii.ljj.aop.impl;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class ValidateAspect {
    @Before("com.csii.ljj.aop.impl.LoggingAspect.declarePointExpression()")
    public void beforMethod(){
        System.out.println("------------validte----------------");
    }
}
