package com.csii.ljj.aop.helloworld;

public class ArithmeticCaculatorLoggingImpl implements ArithmeticCaculator {
    private int result ;
    @Override
    public int add(int i, int j) {
        System.out.println(" add method begin with [ "+i+","+j+"]");
        result = i + j;
        System.out.println(" add method end with [ "+i+","+j+"]");
        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println(" sub method begin with [ "+i+","+j+"]");
        result = i - j;
        System.out.println(" sub method end with [ "+i+","+j+"]");
        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println(" mul method begin with [ "+i+","+j+"]");
        result = i * j;
        System.out.println(" mul method end with [ "+i+","+j+"]");
        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println(" div method begin with [ "+i+","+j+"]");
        result = i / j;
        System.out.println(" div method end with [ "+i+","+j+"]");
        return result;
    }
}
