package com.ljj.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/*
* 静态工厂方法：直接调用某一个类的静态方法就可以返回Bean实例
* */
public class StaticCarFactory {
    private static Map<String,Car> cars = new HashMap<String, Car>();
    static {
        cars.put("Audi",new Car("Audi",30000));
        cars.put("BWM",new Car("BWM",400000));
    }

    public static Car getBeanByname(String name){
        return cars.get(name);
    }   

}
