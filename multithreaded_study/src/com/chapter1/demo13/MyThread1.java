package com.chapter1.demo13;

public class MyThread1 extends Thread {

	public void run(){
		System.out.println("MyThread1 run priority = "+ this.getPriority());
		
		MyThread2 thread2 = new MyThread2();
		thread2.start();
	}
}
