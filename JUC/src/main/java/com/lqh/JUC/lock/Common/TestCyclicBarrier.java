package com.lqh.JUC.lock.Common;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName: TestCyclicBarrier.java
 * @Description: 加法计数器
 * @Author: LQH
 * @Data: 2020年05月20日 21:29:00
 * @Version: 1.0
 **/

public class TestCyclicBarrier {
	public static void main(String[] args) {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () -> {
			System.out.println("召唤成功");
		});
		for (int i = 0; i < 7; i++) {
			
			final int temp = i;
			
			new Thread(() -> {
				System.out.println(Thread.currentThread().getName() + "收集" + temp + "个");
				try {
					cyclicBarrier.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					e.printStackTrace();
				}
			}).start();
		}
	}
}


