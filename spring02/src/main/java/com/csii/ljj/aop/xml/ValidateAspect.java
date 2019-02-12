package com.csii.ljj.aop.xml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


public class ValidateAspect {
    public void beforMethod(){
        System.out.println("------------validte----------------");
    }
}
