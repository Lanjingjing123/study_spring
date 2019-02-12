package com.ljj.spring.beans.cycle;

public class Car {
    public Car(){
        System.out.println("Car's Constructor...");

    }
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("Set Brand");
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public void init(){
        System.out.println("init....");
    }
    public void destory(){
        System.out.println("destroy.....");
    }
}
