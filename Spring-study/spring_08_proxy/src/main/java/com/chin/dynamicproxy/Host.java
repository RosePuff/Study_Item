package com.chin.dynamicproxy;

/**
 * @ClassName: Host
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/23
 * @Version: 1.0
 **/
public class Host implements Rent {
    @Override
    public void renter() {
        System.out.println("出租房子");
    }
}
