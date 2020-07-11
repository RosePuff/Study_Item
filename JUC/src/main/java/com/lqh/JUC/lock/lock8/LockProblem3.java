package com.lqh.JUC.lock.lock8;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: LockProblem3.java
 * @Description: 锁的问题3
 * @Author: LQH
 * @Data: 2020年05月15日 02:19:00
 * @Version: 1.0
 **/

public class LockProblem3 {
	/*
	5、增加两个静态的方法，只有一个对象，先执行什么？
	首先执行SendSMS()，static——静态方法，在类加载的时候就有了，是一个Class模板，是因为锁的是Demo3。class这个对象，static synchronized锁的是Demo3.class这个模板
	6、两个对象，增加两个静态的同步方法
	也是先输出SendSMS，因为staticClass模板
	 */
	
	// 相当与当不加static的时候synchronized锁是由对象来操作，但是加了static的时候是锁了整个Demo3.class类，而demo和demo2调用的都是Demo3.class，
	// 所以直接源头就锁住了
	public static void main(String[] args) {
		Demo3 demo = new Demo3();
		Demo3 demo2 = new Demo3();
		
		new Thread(() -> {
			demo.SendSMS();
		}, "A").start();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		new Thread(() -> {
			demo2.CallPhone();
		}, "B").start();
	}
	
}

class Demo3 {
	public static synchronized void SendSMS() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("SendSMS");
	}
	
	public static synchronized void CallPhone() {
		System.out.println("CallPhone");
	}
}