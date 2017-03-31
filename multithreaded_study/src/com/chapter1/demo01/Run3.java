package com.chapter1.demo01;

/**
 * 判断线程是否停止 isInterrupted 多次调用也是停止状态
 * 
 * @author Administrator
 *
 */

public class Run3 {
	
	public static void main(String[] args) {

		try {
			
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(5);
			thread.interrupt();

			System.out.println("是否停止1?=" + thread.isInterrupted());
			System.out.println("是否停止2?=" + thread.isInterrupted());

		} catch (InterruptedException e) {
			System.out.println("main catch");

			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
