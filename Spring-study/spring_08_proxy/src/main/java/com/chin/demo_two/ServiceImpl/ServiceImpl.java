package com.chin.demo_two.ServiceImpl;

import com.chin.demo_two.Service.Service;

/**
 * @ClassName: ServiceImpl
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/22
 * @Version: 1.0
 **/
public class ServiceImpl implements Service {

    @Override
    public void add() {
        System.out.println("增加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void update() {
        System.out.println("修改用户");
    }

    @Override
    public void query() {
        System.out.println("查询用户");
    }
}
