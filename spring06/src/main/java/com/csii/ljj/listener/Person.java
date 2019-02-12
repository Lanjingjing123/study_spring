package com.csii.ljj.listener;

public class Person {
    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void hello(){
        System.out.println("It's my name: "+ this.userName);
    }
}
