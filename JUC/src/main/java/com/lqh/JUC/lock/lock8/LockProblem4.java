package com.lqh.JUC.lock.lock8;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: LockProblem4.java
 * @Description: TODO
 * @Author: LQH
 * @Data: 2020年05月16日 23:49:00
 * @Version: 1.0
 **/

public class LockProblem4 {
	/*
	7、一个静态同步方法，一个普通同步方法，一个对象；
	先执行CallPhone，B线程
	因为静态同步方法static锁的是Class的类模板，普通同步方法锁的是调用者，两个方法用的不是同一个锁，所以调用CallPhone的时候不用等待SendSMS的锁
	8、一个静态同步方法，一个普通同步方法，两个对象；
	还是调用的是对象模板
	 */
	public static void main(String[] args) {
		Demo4 demo = new Demo4();
		Demo4 demo1 = new Demo4();
		
		new Thread(() -> {
			demo.SendSMS();
		}, "A").start();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		new Thread(() -> {
			demo1.CallPhone();
		}, "B").start();
	}
	
}

class Demo4 {
	public static synchronized void SendSMS() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("SendSMS");
	}
	
	public synchronized void CallPhone() {
		System.out.println("CallPhone");
	}
}