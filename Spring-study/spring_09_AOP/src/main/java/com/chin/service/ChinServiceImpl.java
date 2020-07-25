package com.chin.service;

/**
 * @ClassName: ChinServiceImpl
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/24
 * @Version: 1.0
 **/
public class ChinServiceImpl implements ChinService {

    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改用户");
    }

    @Override
    public void select() {
        System.out.println("查询用户");
    }
}
