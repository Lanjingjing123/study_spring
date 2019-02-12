package com.ljj.spring.beans.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-cycle.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
        applicationContext.close();
    }
}
