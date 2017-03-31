package com.chapter1.demo06;

public class MyThread extends Thread {

	private SynchronizedObject object;
	
	public MyThread(SynchronizedObject object){
		this.object= object ;
	}
	
	public void run() {

		object.printString("b", "bb");
	}

}
