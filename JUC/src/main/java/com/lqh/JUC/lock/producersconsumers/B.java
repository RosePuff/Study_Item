package com.lqh.JUC.lock.producersconsumers;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: B.java
 * @Description: TODO
 * @Author: LQH
 * @Data: 2020年05月13日 01:55:00
 * @Version: 1.0
 **/

public class B {
	public static void main(String[] args) {
		Data2 data = new Data2();
		
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					data.increment();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}, "A").start();
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					data.decrement();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}, "B").start();
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					data.decrement();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}, "C").start();
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					data.decrement();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}, "D").start();
	}
}

/**
 * 资源类：等待，业务，通知
 */
class Data2 {
	private int num = 0;
	
	Lock lock = new ReentrantLock();
	Condition condition = lock.newCondition();
	
	// +1
	public void increment()throws InterruptedException {
		try {
			lock.lock();
			while (num != 0) {
				// 等待
				this.condition.await();
			}
			num++;
			System.out.println(Thread.currentThread().getName() + "==>" + num);
			// 通知
			this.condition.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getClass() + e.getMessage());
		} finally {
			lock.unlock();
		}
	}
	
	//-1
	public void decrement()throws InterruptedException {
		try {
			lock.lock();
			while (num == 0) {
				// 等待
				condition.await();
			}
			num--;
			System.out.println(Thread.currentThread().getName() + "==>" + num);
			// 通知
			condition.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getClass() + e.getMessage());
		} finally {
			lock.unlock();
		}
	}
}