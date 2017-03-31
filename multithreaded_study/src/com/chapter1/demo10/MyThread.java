package com.chapter1.demo10;

public class MyThread extends Thread {
	private long i = 0;

	public void run() {
		while (true) {
			i++;
			
			System.out.println(i);
		}
	}
}
