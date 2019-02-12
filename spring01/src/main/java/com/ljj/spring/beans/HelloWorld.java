package com.ljj.spring.beans;

public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name+"yyy";
    }

    public  void hello(){
        System.out.print("hello:"+name);
    }
    public HelloWorld(){
        System.out.println("this HelloWorl's Constructor!");
    }
}
