package com.chapter1.demo15;

/**
 * �����߳� һ���û��߳� �����ػ��߳�
 * �ػ��߳���Ϊ���ػ��߳��ṩ����
 * �ػ��̵߳� ���з��ػ��߳̽������ػ��߳�����Զ�����
 * 
 * @author Administrator
 *
 */
public class Run {

	public static void main(String[] args) {

		try {
			MyThread thread = new MyThread();
			// ����Ϊ��̨�߳�
			thread.setDaemon(true);

			thread.start();
			Thread.sleep(5000);

			System.out.println("���뿪 thread ����Ҳ���ڴ�ӡ��,Ҳ����ֹͣ��!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
