package com.ljj.spring.beans.annotation;

import com.ljj.spring.beans.annotation.controller.UserController;
import com.ljj.spring.beans.annotation.repository.UserRepository;
import com.ljj.spring.beans.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-annotation.xml");

//        TestObject testObject = (TestObject)applicationContext.getBean("testObject");
//        System.out.println(testObject);

        UserController userController = (UserController)applicationContext.getBean("userController");
        userController.execute();
//        UserService userService = (UserService)applicationContext.getBean("userService");
//        System.out.println(userService);
//ler@7113b13f
//        UserRepository userRepository = (UserRepository) applicationContext.getBean("userRepository");
//        System.out.println(userRepository);


    }
}
