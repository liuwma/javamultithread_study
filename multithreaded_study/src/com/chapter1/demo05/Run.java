package com.chapter1.demo05;

/**
 * 能停止的线程--暴力停止
 * 
 * @author Administrator
 *
 */
public class Run {

	public static void main(String[] args) {

		try {

			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(8000);
			// 调用stop方法时会抛出java.lang.ThreadDeath异常,通常情况下不用显示捕捉
			thread.stop();

		} catch (InterruptedException e) {
			System.out.println("main catch");

			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
