package com.chapter2.demo03;

public class ThreadB extends Thread {
	private HasSelfPrivateNum numRef;

	public ThreadB(HasSelfPrivateNum numRef) {
		this.numRef = numRef;
	}

	public void run() {
		numRef.addI("b");
	}
}
