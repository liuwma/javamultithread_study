package com.chapter1.demo07;

public class MyThread extends Thread {
	public void run() {

		for (int i = 0; i < 500000; i++) {
			if (this.interrupted()) {
				System.out.println("已经是停止状态了!我要退出了!");
				return;
			}
			System.out.println("i=" + (i + 1));
		}

		System.out.println("我在for下面");

	}
}
