package com.ljj.spring.beans;

public class Car {
    private String brand;
    private String corp;
    private int price;
    private double max;

    public Car(String brand, String corp, double max) {
        System.out.println("The Car's Constructor!!! 1 ");
        this.brand = brand;
        this.corp = corp;
        this.max = max;
    }

    public Car(String brand, String corp, int price) {
        System.out.println("The Car's Constructor!!! 2");
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", max=" + max +
                '}';
    }
}
