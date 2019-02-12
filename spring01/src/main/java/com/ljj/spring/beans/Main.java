package com.ljj.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){

        /*
        *1. new一个对象
        * */
//        HelloWorld helloWorld = new HelloWorld();

//        /*
//        * 2. set一个值
//        * */
//        helloWorld.setName("world");
//        /*
//        * 3.调用
//        * */
//        helloWorld.hello();
//        1. IOC容器
        // ClassPathXmlApplicationContext 为ApplicationContext的实现类
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        2. 从容器中获取bean
//        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWrold");
//        Car car = (Car)applicationContext.getBean("car");
          Person person = (Person) applicationContext.getBean("person2");
//        3.调用
//        helloWorld.hello();
        System.out.println(person);
    }
}
