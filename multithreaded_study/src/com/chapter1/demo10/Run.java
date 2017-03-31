package com.chapter1.demo10;

/**
 * suspend与resume方法缺点--独占
 * @author Administrator
 *
 */
public class Run {

	public static void main(String[] args) {

		try {
			MyThread thread = new MyThread();
			thread.start();
			
			Thread.sleep(1000);
			
			thread.suspend();
			
			System.out.println("main end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
