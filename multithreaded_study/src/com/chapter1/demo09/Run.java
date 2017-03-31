package com.chapter1.demo09;


/**
 * suspend与resume方法缺点--独占
 * @author Administrator
 *
 */
public class Run {

	public static void main(String[] args ){
		
		try {
			final SynchronizedObject object = new SynchronizedObject();
			Thread thread1 = new Thread(){
				public void run(){
					object .printString();
				}
			};
			
			thread1.setName("a");
			thread1.start();
			
			Thread.sleep(1000);
			
			
			Thread thread2 = new Thread(){
				public void run(){
					System.out.println("thread2启动了，但进入不了 printSring()方法!只打印一个bgin");
					System.out.println("因为pringString() 方法被 a线程锁定并且永远 suspend暂停了!");
					
					object .printString();
				}
			};
			
			thread2.start();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}

