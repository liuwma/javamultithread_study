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

			System.out.println("我在while下面");

		} catch (InterruptedException e) {
			System.out.println("暴力停止!进入catch!" + this.interrupted());
			e.printStackTrace();
		}
	}

}
