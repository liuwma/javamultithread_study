package com.study.test;

public class MyThread extends Thread {

	public void run() {
		try {
			System.out.println("子线程执行");
			Thread.sleep(3000);
			System.out.println("子线程结束");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
