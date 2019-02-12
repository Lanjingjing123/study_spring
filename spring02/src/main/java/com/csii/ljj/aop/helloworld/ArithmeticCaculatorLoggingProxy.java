package com.csii.ljj.aop.helloworld;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ArithmeticCaculatorLoggingProxy {
    // 1.定义要代理的对象
    private ArithmeticCaculator target;

    public ArithmeticCaculatorLoggingProxy(ArithmeticCaculator target) {
        this.target = target;
    }

    // 2. 一个方法——返回代理对象(和接口类型一致)
    public ArithmeticCaculator getArithmeticCaculator(){
        ArithmeticCaculator proxy = null;
        //第一个参数，目标类构造器
        ClassLoader loader=target.getClass().getClassLoader();
        // 第二个参数 ，目标方法的接口类型，即方法有哪些
        Class[] interfaces = new Class[]{ArithmeticCaculator.class};
        // 第三个参数，执行调用的方法
        InvocationHandler h = new InvocationHandler() {
          /*
          * proxy:正在返回的代理对象，一般情况下，在Invoke方法中不使用该对象
          * method：正在被调用的方法
          * args:调用方法的参数
          * */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try{
                    //前置通知
                    result = method.invoke(target, args);
                    // 返回通知
                }catch (Exception e){
                    //异常通知
                    throw e;
                }finally {
                // 后置通知
                return result;
                }
            }
        };
        proxy =(ArithmeticCaculator) Proxy.newProxyInstance(loader,interfaces,h);
        return proxy;
    }
}
