package com.chapter1.demo09;

public class SynchronizedObject {

	synchronized public void printString(){
		System.out.println("begin");
		
		if(Thread.currentThread().getName().equals("a")){
			System.out.println("a �߳���Զ suspend ��!");
			Thread.currentThread().suspend();
		}
		
		System.out.println("end");
	}
}
