package com.chapter1.demo07;

public class MyThread extends Thread {
	public void run() {

		for (int i = 0; i < 500000; i++) {
			if (this.interrupted()) {
				System.out.println("�Ѿ���ֹͣ״̬��!��Ҫ�˳���!");
				return;
			}
			System.out.println("i=" + (i + 1));
		}

		System.out.println("����for����");

	}
}
