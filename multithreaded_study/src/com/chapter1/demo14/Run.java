package com.chapter1.demo14;

/**
 * 1.���ȼ���Ϊ 1 ~ 10 ,����10��С��1 ���ᱨ��
 * 2.�����ȼ���������ִ�����
 * 3.���ȼ������� ����� 
 * @author Administrator
 *
 */
public class Run {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			
			MyThread1 thread1 = new MyThread1();
			//�������ȼ� (1~10)
			thread1.setPriority(10);
			thread1.start();
			
			MyThread2 thread2 = new MyThread2();
			//�������ȼ� (1~10)
			thread2.setPriority(1);
			thread2.start();
			
		}
	}
}
