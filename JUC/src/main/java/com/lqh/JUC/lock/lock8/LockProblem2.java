package com.lqh.JUC.lock.lock8;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: LockProblem2.java
 * @Description: 锁问题2
 * @Author: LQH
 * @Data: 2020年05月15日 01:09:00
 * @Version: 1.0
 **/

public class LockProblem2 {
	/*
	1、增加一个普通方法Hello()，先执行什么？
	先执行Hello()因为没有锁，不是同步方法，所以直接执行
	2、两个对象，两个同步方法，先执行什么？
	先执行CallPhone()，后执行SendSMS()，因为是两个对象，两个调用者，那么调用的是两把锁，调用的时间不一样，而CallPhone()没有sleep()，所以先执行demo3对象的方法
	 */
	public static void main(String[] args) {
		Demo2 demo3 = new Demo2();
		Demo2 demo2 = new Demo2();
		
		new Thread(demo2::SendSMS, "A").start();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new Thread(demo3::CallPhone, "B").start();
//		new Thread(demo2::Hello, "B").start();
	}
	
}

class Demo2 {
	public synchronized void SendSMS() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("sendSMS");
	}
	
	public synchronized void CallPhone() {
		System.out.println("CallPhone");
	}
	
	public void Hello() {
		System.out.println("Hello");
	}
}