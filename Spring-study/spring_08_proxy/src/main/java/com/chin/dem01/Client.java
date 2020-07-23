package com.chin.dem01;

/**
 * @ClassName: Client
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/22
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        // host.renter();
        Proxy proxy = new Proxy(host);
        proxy.renter();
    }
}
