package com.chapter1.demo06;

/**
 * ��ֹͣ���߳�--����ֹͣ
 * 
 * @author Administrator
 *
 */
public class Run {

	public static void main(String[] args) {

		try {

			SynchronizedObject object = new SynchronizedObject();

			MyThread thread = new MyThread(object);

			thread.start();
			Thread.sleep(500);
			// ����stop����ʱ���׳�java.lang.ThreadDeath�쳣,ͨ������²�����ʾ��׽
			//thread.stop();
			thread.interrupt();
			Thread.sleep(600);
			System.out.println(object.getUsername() + " " + object.getPassword());

		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
