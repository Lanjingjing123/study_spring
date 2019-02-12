package com.ljj.spring.beans.properties;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-properties.xml");
        DruidDataSource druidDataSource = (DruidDataSource) applicationContext.getBean("dataSource");
        System.out.println(druidDataSource);
    }
}
