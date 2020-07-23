package com.chin.demo_two;

import com.chin.demo_two.Proxy.ServiceProxy;
import com.chin.demo_two.ServiceImpl.ServiceImpl;

/**
 * @ClassName: Client
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/23
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        ServiceProxy serviceProxy = new ServiceProxy();

        serviceProxy.setService(service);

        serviceProxy.add();
    }
}
