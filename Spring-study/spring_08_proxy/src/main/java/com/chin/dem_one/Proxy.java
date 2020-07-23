package com.chin.dem_one;

/**
 * @ClassName: Proxy
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/22
 * @Version: 1.0
 **/
public class Proxy implements Rent{

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void renter() {
        host.renter();
    }

    public void seeHouse(){
        System.out.println("看房");
    }

    public void fare(){
        System.out.println("中介费");
    }

}
