package com.chin.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @ClassName: AnnotationDevelopment
 * @Description: 使用注解方式实现AOP
 * @Author: LQH
 * @Date: 2020/07/25
 * @Version: 1.0
 **/
@Aspect
public class AnnotationDevelopment {

    @Before("execution(* com.chin.service.ChinServiceImpl.*(..))")
    public void before() {
        System.out.println("方法执行之前======");
    }

    @After("execution(* com.chin.service.ChinServiceImpl.*(..))")
    public void after() {
        System.out.println("方法执行之后++++++");
    }

    @Around("execution(* com.chin.service.ChinServiceImpl.*(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕前");
        System.out.println("signature：" + point.getSignature());
        // 执行方法
        point.proceed();
        System.out.println("环绕之后" + point.proceed());
    }
}
