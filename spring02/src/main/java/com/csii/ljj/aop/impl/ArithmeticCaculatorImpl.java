package com.csii.ljj.aop.impl;

import org.springframework.stereotype.Component;

@Component(value = "arithmeticCaculator")
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
        System.out.println("------------In the Method------------");
        return result;
    }

    @Override
    public int mul(int i, int j) {
        result = i * j;
        return result;
    }

    @Override
    public int div(int i, int j) {

        System.out.println("-----------------IN THE METHOD Before the execution.... --------------");
        result = i / j;
        System.out.println("-----------------IN THE METHOD After the execution ....------------------------");
        return result;
    }
}
