package com.chapter2.demo01;

public class ThreadB extends Thread {
	private HasSelfPrivateNum numRef;

	public ThreadB(HasSelfPrivateNum numRef) {
		this.numRef = numRef;
	}

	public void run() {
		numRef.addI("b");
	}
}
