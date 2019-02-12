package com.ljj.spring.beans.factoryBean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean {
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /*
    * 返回bean的类型
    * */
    @Override
    public Object getObject() throws Exception {
        return new Car(brand,499999);
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
