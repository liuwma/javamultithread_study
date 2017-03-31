package com.chapter1.demo12;

public class MyThread extends Thread {

	public void run() {
		long beginTime = System.currentTimeMillis();
		int count = 0;

		for (int i = 0; i < 5000000; i++) {
			//yield() 放弃cpu资源，让给其它任务，但放弃的时间不确定,有可能刚放弃马上就获取cpu权限.
			Thread.yield();
			count = count + (i + 1);
		}
		long endTime = System.currentTimeMillis();

		System.out.println("用时: " + (endTime - beginTime) + "毫秒!");
	}
}
