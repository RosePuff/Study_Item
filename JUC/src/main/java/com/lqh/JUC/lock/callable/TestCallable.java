package com.lqh.JUC.lock.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName: TestCallable.java
 * @Description: TODO
 * @Author: LQH
 * @Data: 2020年05月19日 16:35:00
 * @Version: 1.0
 **/

public class TestCallable {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		// 传统方式
//		new Thread(new MyThread()).start();
//		new Thread(new Runnable()).start();
//		new Thread(new FutureTask<v>()).start();
//		new Thread(new FutureTask<v>(Callable)).start();
		new Thread().start();
		
		MyThread myThread = new MyThread();
		FutureTask futureTask = new FutureTask(myThread);
		// 适配类
		new Thread(futureTask, "A").start();
		// 获取Callable返回的结果
		Integer o = (Integer) futureTask.get();
		System.out.println(o);
	}
}

class MyThread implements Callable<Integer> {
	
	
	@Override
	public Integer call() throws Exception {
		System.out.println("Call()");
		return 1024;
	}
}
