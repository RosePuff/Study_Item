package com.chin.entity;

/**
 * @ClassName: User
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/14
 * @Version: 1.0
 **/
public class UserT {
    private String name;

    public UserT() {
        System.out.println("UserT无参构造创建了：");
    }

    public UserT(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name = " + name);
    }
}
