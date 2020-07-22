package com.chin.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

/**
 * @ClassName: User
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/18
 * @Version: 1.0
 **/
@Controller
public class User {

    private String name;

    public String getName() {
        return name;
    }

    @Value("gettewtesF")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
