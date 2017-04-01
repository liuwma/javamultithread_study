package com.chapter1.demo15;

/**
 * 两种线程 一是用户线程 二是守护线程
 * 守护线程是为非守护线程提供服务
 * 守护线程当 所有非守护线程结束后，守护线程最后自动结束
 * 
 * @author Administrator
 *
 */
public class Run {

	public static void main(String[] args) {

		try {
			MyThread thread = new MyThread();
			// 设置为后台线程
			thread.setDaemon(true);

			thread.start();
			Thread.sleep(5000);

			System.out.println("我离开 thread 对象也不在打印了,也就是停止了!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
