package com.chapter1.demo13;

public class MyThread2  extends Thread{
	public void run(){
		System.out.println("MyThread1 run priority = "+ this.getPriority());
		
	}
}
