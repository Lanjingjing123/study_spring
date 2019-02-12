package com.ljj.spring.beans.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-generic-di.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.add();
    }
}
