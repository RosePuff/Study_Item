package com.lqh.JUC.lock.unsafecollectionclass;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @ClassName: TestSet.java
 * @Description: Set多线程
 * @Author: LQH
 * @Data: 2020年05月17日 02:08:00
 * @Version: 1.0
 **/

public class TestSet {
	public static void main(String[] args) {
		/*
		一样多线程会出现：并发修改异常——java.util.ConcurrentModificationException
		
		 */
		Set<String> set = new HashSet<>();

//		Set<String> set = Collections.synchronizedSet(new HashSet<>());
//		Set<String> set = new CopyOnWriteArraySet<>();
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				set.add(UUID.randomUUID().toString().substring(0, 5));
				System.out.println(set);
			}, String.valueOf(i)).start();
		}
	}
}
