package com.ljj.spring.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Car car1 = (Car) applicationContext.getBean("car");
//        System.out.println(car1);

        Car car2 = (Car) applicationContext.getBean("car2");
        System.out.println(car2);
    }
}
