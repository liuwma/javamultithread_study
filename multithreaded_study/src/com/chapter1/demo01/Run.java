package com.chapter1.demo01;

public class Run {

	public static void main(String[] args) {

		try {
			Thread.sleep(1000);
			MyThread thread = new MyThread();
			thread.start();

			thread.interrupt();
			
			System.out.println("ÊÇ·ñÍ£Ö¹1?=" + thread.interrupted());
			System.out.println("ÊÇ·ñÍ£Ö¹2?=" + thread.interrupted());
			
		} catch (InterruptedException e) {
			System.out.println("main catch");

			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
