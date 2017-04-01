package com.chapter2.demo05;

public class MyThread2 extends Thread {

	private Task task;

	public MyThread2(Task task) {
		this.task = task;
	}

	public void run() {
		CommonUtils.beginTime2 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.endTime2 = System.currentTimeMillis();
	}
}
