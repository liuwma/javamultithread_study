package com.chapter1.demo12;

public class MyThread extends Thread {

	public void run() {
		long beginTime = System.currentTimeMillis();
		int count = 0;

		for (int i = 0; i < 5000000; i++) {
			//yield() ����cpu��Դ���ø��������񣬵�������ʱ�䲻ȷ��,�п��ܸշ������Ͼͻ�ȡcpuȨ��.
			Thread.yield();
			count = count + (i + 1);
		}
		long endTime = System.currentTimeMillis();

		System.out.println("��ʱ: " + (endTime - beginTime) + "����!");
	}
}
