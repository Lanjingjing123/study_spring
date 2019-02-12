package com.csii.ljj.aop.helloworld;

public class Test {
    public static void main(String[] args){
        ArithmeticCaculator target = new ArithmeticCaculatorLoggingImpl();

        ArithmeticCaculatorLoggingProxy proxy = new ArithmeticCaculatorLoggingProxy(target);
        ArithmeticCaculator arithmeticCaculator=proxy.getArithmeticCaculator();
        System.out.println(arithmeticCaculator.getClass().getName());
        int result = arithmeticCaculator.add(1,2);
        System.out.println("add result: " + result);

        result = arithmeticCaculator.mul(2,5);
        System.out.println(" mul result:"+ result);
    }

}
