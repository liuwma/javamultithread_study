package com.chapter1.demo02;

public class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 500000; i++) {
			if(this.interrupted()){
				System.out.println("�Ѿ���ֹͣ״̬��!��Ҫ�˳���!");
				break;
			}
			System.out.println("i=" + (i+1));
		}
		
		System.out.println("�ұ����,����˴�����for�ּ�������,�̲߳�δֹͣ!");
	}
}