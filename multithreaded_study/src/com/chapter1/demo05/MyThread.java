package com.chapter1.demo05;

public class MyThread extends Thread {

	private int i = 0;

	public void run() {

		try {
			while (i < 20) {
				i++;
				System.out.println("i=" + i);

				Thread.sleep(1000);
			}

			System.out.println("����while����");

		} catch (InterruptedException e) {
			System.out.println("����ֹͣ!����catch!" + this.interrupted());
			e.printStackTrace();
		}
	}

}
