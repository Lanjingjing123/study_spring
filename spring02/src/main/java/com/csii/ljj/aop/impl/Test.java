package com.csii.ljj.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArithmeticCaculator arithmeticCaculator = (ArithmeticCaculator) applicationContext.getBean("arithmeticCaculator");
        int result = arithmeticCaculator.div(10, 5);
        System.out.println(result);

        result = arithmeticCaculator.sub(2,1);
        System.out.println(result);
    }

}
