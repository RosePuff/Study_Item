package com.chin.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @ClassName: User
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/17
 * @Version: 1.0
 **/

@Component
@Scope("singleton ")
public class User {

    // 相当于配置文件里面的 <property name="name" value="DI注入"/>
    @Value("chin")
    public String name;
}
