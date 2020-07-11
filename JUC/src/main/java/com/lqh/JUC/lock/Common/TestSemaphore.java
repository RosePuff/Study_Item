package com.lqh.JUC.lock.Common;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: TestSemaphore.java
 * @Description: JUC里面的信号量
 * @Author: LQH
 * @Data: 2020年05月20日 21:35:00
 * @Version: 1.0
 **/

public class TestSemaphore {
	public static void main(String[] args) {
		// 空位，可以起到限流的作用
		Semaphore semaphore = new Semaphore(3);
		for (int i = 0; i <= 6; i++) {
			new Thread(() -> {
				try {
					semaphore.acquire();
					System.out.println(Thread.currentThread().getName() + "得到位置");
					TimeUnit.SECONDS.sleep(2);
					System.out.println(Thread.currentThread().getName() + "离开位置");
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					semaphore.release();
				}
			}, String.valueOf(i)).start();
		}
	}
}
