package com.chin.entity;

/**
 * @ClassName: Address
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/15
 * @Version: 1.0
 **/
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
