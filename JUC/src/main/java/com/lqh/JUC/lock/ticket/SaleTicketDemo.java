package com.lqh.JUC.lock.ticket;

/**
 * @ClassName: SaleTicketDemo.java
 * @Description: 卖票的例子
 * @Author: LQH
 * @Data: 2020年05月10日 16:50:00
 * @Version: 1.0
 **/

public class SaleTicketDemo {
	// 线程就是一个单独的资源类没有任何的附属操作
	public static void main(String[] args) {
		// 并发多线程操作
		Ticket ticket = new Ticket();
		
		new Thread(() -> {
			for (int i = 0; i < 40; i++) {
				ticket.sale();
			}
		}, "A").start();
		
		new Thread(() -> {
			for (int i = 0; i < 40; i++) {
				ticket.sale();
			}
		}, "B").start();
		
		new Thread(() -> {
			for (int i = 0; i < 40; i++) {
				ticket.sale();
			}
		}, "C").start();
	}
}
class Ticket {
	
	private int number = 40;
	
	public synchronized void sale() {
		if (number > 0) {
			System.out.println(Thread.currentThread().getName() + "卖出了：" + number-- + "票，剩余：" + number);
		}
	}
}