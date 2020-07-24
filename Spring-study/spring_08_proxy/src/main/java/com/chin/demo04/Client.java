package com.chin.demo04;

import com.chin.demo02.Service.Service;
import com.chin.demo02.ServiceImpl.ServiceImpl;

/**
 * @ClassName: Client
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/23
 * @Version: 1.0
 **/
public class Client {

    public static void main(String[] args) {
        // 真实角色
        ServiceImpl service = new ServiceImpl();
        // 代理角色
        ProxyInvocationHandler handler = new ProxyInvocationHandler();

        handler.setTarget(service);

        // 动态生成代理类
        Service proxy = (Service) handler.getProxy();

        proxy.add();
    }
}
