package com.lqh.JUC.lock.lock8;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: TestA.java
 * @Description: 锁的问题1
 * @Author: LQH
 * @Data: 2020年05月14日 13:20:00
 * @Version: 1.0
 **/

public class LockProblem1 {
	
	/*
	1、标准情况下，两个线程哪个先出现？
	2、在同步方法块SendSMS()中增加3s的延迟，谁先调用？
	SendSMS()先执行，CallPhone()后执行
	锁的问题，synchronized 锁的对象是方法的调用者，A、B线程都是调用的是Phone对象中的锁（同一把锁）
	而Phone对象的锁都是同一个锁，所以就是谁先拿到锁，就是谁先执行，相当于单线程
	
	 */
	public static void main(String[] args) {
		Phone phone = new Phone();
		
		new Thread(() -> {
			phone.SendSMS();
		}, "A").start();
		
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		new Thread(phone::CallPhone, "B").start();
	}
}

class Phone {
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
}
