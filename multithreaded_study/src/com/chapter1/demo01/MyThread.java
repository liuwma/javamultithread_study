package com.chapter1.demo01;

public class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println("i=" + i);
		}
	}
}
