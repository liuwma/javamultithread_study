package com.study.test;

public class Run {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("���߳̿�ʼ");

		MyThread thread1 = new MyThread();
		
		thread1.start();
		
		thread1.join(); //�ȴ����߳̽���
		
		System.out.println("���߳̽���");
	}
}
