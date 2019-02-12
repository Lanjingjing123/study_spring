package com.ljj.spring.beans.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Person person = (Person) applicationContext.getBean("person3");
        NewPerson newPerson =(NewPerson)applicationContext.getBean("newPerson");
        System.out.println(newPerson);

        DataSource dataSource = applicationContext.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
