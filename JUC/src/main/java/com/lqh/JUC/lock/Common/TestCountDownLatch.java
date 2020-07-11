package com.lqh.JUC.lock.Common;


import java.util.concurrent.CountDownLatch;

/**
 * @ClassName: CountDownLatch.java
 * @Description: TODO
 * @Author: LQH
 * @Data: 2020年05月19日 19:23:00
 * @Version: 1.0
 **/

public class TestCountDownLatch {
	public static void main(String[] args) throws InterruptedException {
		// 总数设定为6
		CountDownLatch countDownLatch = new CountDownLatch(6);
		
		for (int i = 0; i < 6; i++) {
			new Thread(() -> {
				System.out.println(Thread.currentThread().getName());
				countDownLatch.countDown();
			}, String.valueOf(i)).start();
		}
		// 等待计数器归零之后再向下执行
		countDownLatch.await();
		System.out.println("Close Door");
	}
}