package com.study.test;

public class MyThread extends Thread {

	public void run() {
		try {
			System.out.println("���߳�ִ��");
			Thread.sleep(3000);
			System.out.println("���߳̽���");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
