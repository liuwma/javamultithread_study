package com.chapter1.demo06;

/**
 * 能停止的线程--暴力停止
 * 
 * @author Administrator
 *
 */
public class Run {

	public static void main(String[] args) {

		try {

			SynchronizedObject object = new SynchronizedObject();

			MyThread thread = new MyThread(object);

			thread.start();
			Thread.sleep(500);
			// 调用stop方法时会抛出java.lang.ThreadDeath异常,通常情况下不用显示捕捉
			//thread.stop();
			thread.interrupt();
			Thread.sleep(600);
			System.out.println(object.getUsername() + " " + object.getPassword());

		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
