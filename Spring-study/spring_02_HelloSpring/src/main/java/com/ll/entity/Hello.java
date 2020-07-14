package com.ll.entity;

/**
 * @ClassName: Hello
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/14
 * @Version: 1.0
 **/
public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }

    private void show() {
        System.out.println("HELLO" + name);
    }
}
