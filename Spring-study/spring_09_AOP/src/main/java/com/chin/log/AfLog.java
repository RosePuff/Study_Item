package com.chin.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName: AfLog
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/25
 * @Version: 1.0
 **/
public class AfLog implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() + "方法，返回结果为" + returnValue);
    }
}
