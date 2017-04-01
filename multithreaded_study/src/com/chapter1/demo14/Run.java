package com.chapter1.demo14;

/**
 * 1.优先级分为 1 ~ 10 ,高于10或小于1 都会报错
 * 2.高优先级的总是先执行完成
 * 3.优先级还具有 随机性 
 * @author Administrator
 *
 */
public class Run {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			
			MyThread1 thread1 = new MyThread1();
			//设置优先级 (1~10)
			thread1.setPriority(10);
			thread1.start();
			
			MyThread2 thread2 = new MyThread2();
			//设置优先级 (1~10)
			thread2.setPriority(1);
			thread2.start();
			
		}
	}
}
