package com.csii.ljj.aop.impl;

import org.springframework.stereotype.Component;

@Component
public interface ArithmeticCaculator {
    public int add(int i, int j);
    public int sub(int i, int j);
    public int mul(int i, int j);
    public int div(int i, int j);
}
