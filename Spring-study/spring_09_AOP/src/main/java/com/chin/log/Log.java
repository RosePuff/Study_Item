package com.chin.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName: Log
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/24
 * @Version: 1.0
 **/
public class Log implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "的" + method.getName() + "被执行了");
    }
}
