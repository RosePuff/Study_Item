package com.lqh.JUC.lock.readlock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @ClassName: ReadWriteLockDemo.java
 * @Description: TODO
 * @Author: LQH
 * @Data: 2020年05月21日 00:24:00
 * @Version: 1.0
 **/

public class ReadWriteLockDemo {
	public static void main(String[] args) {
		CustomCacheLock customCache = new CustomCacheLock();
		
		for (int i = 1; i <= 5; i++) {
			final int temp = i;
			new Thread(() -> {
				customCache.put(temp + "", temp);
			}, String.valueOf(i)).start();
		}
		for (int i = 1; i <= 5; i++) {
			final int temp = i;
			new Thread(() -> {
				customCache.get(temp + "");
			}, String.valueOf(i)).start();
		}
	}
}

class CustomCacheLock {
	private volatile Map<String, Object> map = new HashMap<>(0);
	// 读写锁，更加细粒度控制
	private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	
	// 存，写，同时只有一个线程在写
	public void put(String key, Object value) {
		readWriteLock.writeLock().lock();
		try {
			System.out.println(Thread.currentThread().getName() + "写入" + key);
			map.put(key, value);
			System.out.println(Thread.currentThread().getName() + "写入OK");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			readWriteLock.writeLock().unlock();
		}
		
	}
	
	// 取，读
	public void get(String key) {
		readWriteLock.readLock().lock();
		try {
			System.out.println(Thread.currentThread().getName() + "读取" + key);
			Object o = map.get(key);
			System.out.println(Thread.currentThread().getName() + "读取OK");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			readWriteLock.readLock().unlock();
		}
	}
}

class CustomCache {
	private volatile Map<String, Object> map = new HashMap<>(0);
	
	// 存，写
	public synchronized void put(String key, Object value) {
		System.out.println(Thread.currentThread().getName() + "写入" + key);
		map.put(key, value);
		System.out.println(Thread.currentThread().getName() + "写入OK");
	}
	
	// 取，读
	public synchronized void get(String key) {
		System.out.println(Thread.currentThread().getName() + "读取" + key);
		Object o = map.get(key);
		System.out.println(Thread.currentThread().getName() + "读取OK");
	}
}

