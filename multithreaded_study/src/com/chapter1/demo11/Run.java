package com.chapter1.demo11;

/**
 * suspend与resume方法缺点--不同步
 * @author Administrator
 *
 */
public class Run {

	public static void main(String[] args) throws InterruptedException
	{
		final MyObject myobject = new MyObject();
		
		Thread thread1 = new Thread(){
			public void run(){
				myobject.setValue("a", "aa");
			};
		};
		
		thread1.setName("a");
		thread1.start();
		
		Thread.sleep(500);
		
		Thread thread2 = new Thread(){
			public void run(){
				myobject.printUsernamePassword();
			};
		};
		
		thread2.start();
		
		
		System.out.println("end!");
	}
}
