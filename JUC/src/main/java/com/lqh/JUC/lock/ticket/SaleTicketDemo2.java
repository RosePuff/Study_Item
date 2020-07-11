package com.lqh.JUC.lock.ticket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: SaleTicketDemo2.java
 * @Description: TODO
 * @Author: LQH
 * @Data: 2020年05月12日 11:20:00
 * @Version: 1.0
 **/

public class SaleTicketDemo2 {
	// 线程就是一个单独的资源类没有任何的附属操作
	public static void main(String[] args) {
		// 并发多线程操作
		Ticket2 ticket = new Ticket2();
		
		new Thread(() -> {
			for (int i = 0; i < 40; i++) ticket.sale();
		}, "A").start();
		
		new Thread(() -> {
			for (int i = 0; i < 40; i++) ticket.sale();
		}, "B").start();
		
		new Thread(() -> {
			for (int i = 0; i < 40; i++) ticket.sale();
		}, "C").start();
	}
}

class Ticket2 {
	
	private int number = 40;
	
	Lock lock = new ReentrantLock();
	
	public void sale() {
		lock.lock();
		lock.tryLock();
		try {
			// 业务代码
			if (number > 0) {
				System.out.println(Thread.currentThread().getName() + "卖出了：" + number-- + "票，剩余：" + number);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getClass() + e.getMessage());
		} finally {
			lock.unlock();
		}
	}
}