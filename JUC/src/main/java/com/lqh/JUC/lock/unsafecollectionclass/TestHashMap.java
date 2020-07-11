package com.lqh.JUC.lock.unsafecollectionclass;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @ClassName: TestHashMap.java
 * @Description: HashMap的不安全
 * @Author: LQH
 * @Data: 2020年05月17日 02:26:00
 * @Version: 1.0
 **/

public class TestHashMap {
	public static void main(String[] args) {
		/*
		map是这样用的吗？
		HashMap在多线程下是不安全的，但是工作之中很多人使用的是HashMap代替JSON
		不是，new HashMap<>();
		默认等价与什么？
		new HashMap<>(16,0.75);
		同理可得java.util.ConcurrentModificationException
		 */
		
		Map<String, Object> map = new HashMap<>();
		for (int i = 0; i < 30; i++) {
			new Thread(() -> {
				map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0, 5));
				System.out.println(map);
			}, String.valueOf(i)).start();
		}
	}
}
