package com.ljj.spring.beans.scope;

public class Car {
    private String banch;
    private int price;

    public String getBanch() {
        return banch;
    }

    @Override
    public String toString() {
        return "Car{" +
                "banch='" + banch + '\'' +
                ", price=" + price +
                '}';
    }

    public void setBanch(String banch) {
        this.banch = banch;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
