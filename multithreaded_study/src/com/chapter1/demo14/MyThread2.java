package com.chapter1.demo14;

import java.util.Random;

public class MyThread2  extends Thread{
	public void run() {

		long beginTime = System.currentTimeMillis();
		long addResult = 0;

		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 5000; i++) {
				Random random = new Random();
				random.nextInt();
				addResult = addResult + i;
			}
		}
		long endTime = System.currentTimeMillis();

		System.out.println("�� �� �� �� ��  thread2 use time = " + (endTime - beginTime));
	}
}