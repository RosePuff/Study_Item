package com.lqh.JUC.lock.unsafecollectionclass;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName: TestList.java
 * @Description: List在多线程是如何的不安全
 * @Author: LQH
 * @Data: 2020年05月17日 00:29:00
 * @Version: 1.0
 **/

public class TestList {
	public static void main(String[] args) {
		// 单线程
//		List<String> list = Arrays.asList("1", "2", "3");
//		list.forEach(System.out::println);
		
		/*
		并发下的集合都会出现这个错误：ArrayList是不安全的
		并发修改异常
		java.util.ConcurrentModificationException
		 第一个解决方案：List<String> list = new Vector<>();
		 可以用Vector解决；ArrayList中的add是怎么写的（扩容的过程）但是ArrayList中的add是JDK1.2出的，而Vector是JDK1.0出的，add的解决方案不好
		 第二种解决方案：List<String> list = Collections.synchronizedList(new ArrayList<>());
		 Collections为list的顶层父类，里面集成了synchronized的各种集合
		 第三种解决方案：
		 CopyOnWrite——写入时复制，CUW（计算机程序设计领域的一种优化创新）
		 多个线程调用的时候，List，读取的时候固定的，写入（覆盖）
		 也就是相当于说是CopyOnWrite操作写入的时候复制一份给调用者，调用者写完之后创建给放回去避免覆盖，造成数据问题
		 CopyOnWrite 比 Vector 好在哪里：CopyOnWrite使用的是Lock锁，而Vector使用的是 synchronized 效率相对来说比较低
		 */

//		List<String> list = new ArrayList<>();
//		List<String> list = new Vector<>();
//		List<String> list = Collections.synchronizedList(new ArrayList<>());
		List<String> list = new CopyOnWriteArrayList<>();
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				list.add(UUID.randomUUID().toString().substring(0, 5));
				System.out.println(list);
			}, String.valueOf(i)).start();
		}
	}
}
