package com.chapter1.demo05;

/**
 * ��ֹͣ���߳�--����ֹͣ
 * 
 * @author Administrator
 *
 */
public class Run {

	public static void main(String[] args) {

		try {

			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(8000);
			// ����stop����ʱ���׳�java.lang.ThreadDeath�쳣,ͨ������²�����ʾ��׽
			thread.stop();

		} catch (InterruptedException e) {
			System.out.println("main catch");

			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
