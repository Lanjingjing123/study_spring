package com.ljj.spring.beans.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("beans-factory.xml");
        Car car = (Car) applicationContext.getBean("car1");
        System.out.println(car);

        Car car2= (Car) applicationContext.getBean("car2");
        System.out.println(car2);
    }
}
