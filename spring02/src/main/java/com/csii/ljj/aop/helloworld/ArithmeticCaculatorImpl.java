package com.csii.ljj.aop.helloworld;

public class ArithmeticCaculatorImpl implements ArithmeticCaculator {
    private int result ;
    @Override
    public int add(int i, int j) {
        result = i + j;
        return result;
    }

    @Override
    public int sub(int i, int j) {
        result = i - j;
        return result;
    }

    @Override
    public int mul(int i, int j) {
        result = i * j;
        return result;
    }

    @Override
    public int div(int i, int j) {
        result = i / j;
        return result;
    }
}
