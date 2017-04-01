package com.chapter2.demo03;

public class ThreadA extends Thread {
	private HasSelfPrivateNum numRef;

	public ThreadA(HasSelfPrivateNum numRef) {
		this.numRef = numRef;
	}

	public void run() {
		numRef.addI("a");
	}
}
