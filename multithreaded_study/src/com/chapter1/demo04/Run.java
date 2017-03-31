package com.chapter1.demo04;

/**
 * ÔÚ³ÁË¯ÖÐÍ£Ö¹
 * @author Administrator
 *
 */
public class Run {

	public static void main(String[] args) {

		try {

			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(200);
			thread.interrupt();

		} catch (InterruptedException e) {
			System.out.println("main catch");

			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
