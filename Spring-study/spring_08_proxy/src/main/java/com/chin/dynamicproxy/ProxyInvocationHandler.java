package com.chin.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: ProxyInvocationHandler
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/23
 * @Version: 1.0
 **/
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    // 处理代理实例，并且返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHost();
        // 动态代理的本质使用的就是反射机制
        Object result = method.invoke(rent, args);
        return result;
    }

    public void seeHost() {
        System.out.println("看房子");
    }
}
