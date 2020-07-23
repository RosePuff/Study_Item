package com.chin.demo_two.Proxy;

import com.chin.demo_two.Service.Service;
import com.chin.demo_two.ServiceImpl.ServiceImpl;

/**
 * @ClassName: ServiceProxy
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/22
 * @Version: 1.0
 **/
public class ServiceProxy implements Service {

    private ServiceImpl service;

    public void setService(ServiceImpl service) {
        this.service = service;
    }

    @Override
    public void add() {
        service.add();
        logger("insert");
    }

    @Override
    public void delete() {
        service.add();
        logger("delete");
    }

    @Override
    public void update() {
        service.add();
        logger("update");
    }

    @Override
    public void query() {
        service.add();
        logger("query");
    }

    // 日志方法
    public void logger(String msg) {
        System.out.println("使用了" + msg + "方法");
    }
}
