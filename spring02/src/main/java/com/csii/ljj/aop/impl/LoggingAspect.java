package com.csii.ljj.aop.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Component
@Aspect
public class LoggingAspect {

    /*
    * 1.运用切入点表达式，其他切入点可直接引用该方法，不在同包下的切入点需要全类名.方法名
    * */
    @Pointcut("execution(public int com.csii.ljj.aop.impl.ArithmeticCaculator.*(..))")
    public void declarePointExpression(){};

    @Before("declarePointExpression()")
    public void beforMethod(JoinPoint joinPoint) {
        String methdName =joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("BeforeMethod "+methdName+args);
    }

    @After("execution(public int com.csii.ljj.aop.impl.ArithmeticCaculator.*(..))")
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("AfterMethod :"+methodName+args);
    }

    @AfterReturning(value = "execution(public int com.csii.ljj.aop.impl.ArithmeticCaculator.*(..))",returning = "result")
    public  void afterReturning(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();
//        List<Object> args = Arrays.asList(joinPoint.getArgs());

        System.out.println("returnning"+":"+methodName+":"+result);
    }

    @AfterThrowing(value="execution(public int com.csii.ljj.aop.impl.ArithmeticCaculator.*(..))",throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint ,Exception ex) {
        String methodName = joinPoint.getSignature().getName();
        Object clazz = joinPoint.getTarget().getClass();
        System.out.println("class:"+clazz+" method:"+methodName+" has occured Exception:"+ex);
    }


}
