package com.chapter1.demo03;

public class MyThread extends Thread {
	public void run() {

		try {
			for (int i = 0; i < 500000; i++) {
				if (this.interrupted()) {
					System.out.println("�Ѿ���ֹͣ״̬��!��Ҫ�˳���!");
					throw new InterruptedException();
				}
				System.out.println("i=" + (i + 1));
			}

			System.out.println("����for����");
		} catch (InterruptedException e) {
			System.out.println("����MyThread.java �� run�����е�catch ��!");
			e.printStackTrace();
		}
	}
}
