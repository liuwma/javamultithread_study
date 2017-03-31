package com.chapter1.demo03;

public class MyThread extends Thread {
	public void run() {

		try {
			for (int i = 0; i < 500000; i++) {
				if (this.interrupted()) {
					System.out.println("已经是停止状态了!我要退出了!");
					throw new InterruptedException();
				}
				System.out.println("i=" + (i + 1));
			}

			System.out.println("我在for下面");
		} catch (InterruptedException e) {
			System.out.println("进入MyThread.java 类 run方法中的catch 了!");
			e.printStackTrace();
		}
	}
}
