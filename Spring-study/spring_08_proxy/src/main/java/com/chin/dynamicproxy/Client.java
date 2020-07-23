package com.chin.dynamicproxy;

/**
 * @ClassName: Client
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/23
 * @Version: 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Host host = new Host();

        // 代理角色
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        // 通过调用程序处理角色来处理调用接口的对象
        handler.setRent(host);

        Rent proxy = (Rent) handler.getProxy();

        proxy.renter();

    }
}
