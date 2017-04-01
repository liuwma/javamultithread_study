package com.chapter2.demo03;

/**
 * 1) A线程先持有object对象的lock 锁，B线程可以以异步的方式调用ojbect的 非syhchronized方法
 * 2) A线程先持有object对象的lock 锁，B线程调用ojbect的 syhchronized方法时 只能排队
 * @author Administrator
 *
 */
public class Run {
	
	public static void main(String[] args){
		HasSelfPrivateNum numRef = new HasSelfPrivateNum();
		
		ThreadA athread = new ThreadA(numRef);
		athread.start();
		
		ThreadB bthread = new ThreadB(numRef);
		bthread.start();
	}
}
