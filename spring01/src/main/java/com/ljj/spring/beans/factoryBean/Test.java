package com.ljj.spring.beans.factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-factoryBean.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
    }


}
