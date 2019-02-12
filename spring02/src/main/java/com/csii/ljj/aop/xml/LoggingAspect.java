package com.csii.ljj.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


public class LoggingAspect {

    /*
    * 1.运用切入点表达式，其他切入点可直接引用该方法，不在同包下的切入点需要全类名.方法名
    * */
    public void declarePointExpression(){};


    public void beforMethod(JoinPoint joinPoint) {
        String methdName =joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("BeforeMethod "+methdName+args);
    }


    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("AfterMethod :"+methodName+args);
    }

    public  void afterReturning(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
//        List<Object> args = Arrays.asList(joinPoint.getArgs());

        System.out.println("returnning"+":"+methodName+":");
    }

    public void afterThrowing(JoinPoint joinPoint ) {
        String methodName = joinPoint.getSignature().getName();
        Object clazz = joinPoint.getTarget().getClass();
        System.out.println("class:"+clazz+" method:"+methodName+" has occured Exception:");
    }

}
