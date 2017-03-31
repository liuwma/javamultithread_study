package com.chapter1.demo04;

public class MyThread extends Thread {

	public void run() {

		try {

			System.out.println("run begin");

			Thread.sleep(200000);

			System.out.println("run end ");
		} catch (InterruptedException e) {
			System.out.println("在沉睡中被停止!进入catch!" + this.interrupted());
			e.printStackTrace();
		}
	}

}
