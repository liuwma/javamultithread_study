package com.chapter1.demo13;

/**
 * java中 线程的优先级具有继承性，子线程会继承父线程的优先级
 * 
 * @author Administrator
 *
 */
public class Run {

	public static void main(String[] args) {
		System.out.println("main thread begin priority = " + Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(6);

		System.out.println("main thread end priority = " + Thread.currentThread().getPriority());

		MyThread1 thread1 = new MyThread1();
		thread1.start();
	}
}
