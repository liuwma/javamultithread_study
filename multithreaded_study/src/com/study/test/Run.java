package com.study.test;

public class Run {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("主线程开始");

		MyThread thread1 = new MyThread();
		
		thread1.start();
		
		thread1.join(); //等待此线程结束
		
		System.out.println("主线程结束");
	}
}
