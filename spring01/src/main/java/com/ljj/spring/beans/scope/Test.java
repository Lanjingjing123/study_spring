package com.ljj.spring.beans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-scope.xml");
//        Car car1 = (Car) applicationContext.getBean("car");
//        System.out.println(car1);
        Car car1 = (Car) applicationContext.getBean("car");
        Car car2 = (Car) applicationContext.getBean("car");
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car2==car1);
    }
}
