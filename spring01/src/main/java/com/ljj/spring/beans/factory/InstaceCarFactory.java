package com.ljj.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class InstaceCarFactory {
    /*
    * 实例工厂方法：需要实例该工厂bean，然后通过工厂的方法获得bean
    * */

    private Map<String,Car>  cars = null;
    public InstaceCarFactory(){
        cars = new HashMap<String,Car>();
        cars.put("Audi",new Car("Audi",40000000));
        cars.put("Ford",new Car("Ford",3000000));
    }

    public Car getCarByName(String name){
        return cars.get(name);
    }
}
