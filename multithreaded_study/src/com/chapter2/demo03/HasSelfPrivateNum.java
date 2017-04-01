package com.chapter2.demo03;

public class HasSelfPrivateNum {

	private int num = 0; // 实例变量 非线程安全

	//关键字 synchronized 取得的锁都是对像锁，而不是一段代码或方法当作锁
	synchronized public void addI(String username) {

		try {

			if (username.equals("a")) {
				num = 100;
				System.out.println("a set over!");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b set over!");
			}

			System.out.println(username + " num = " + num);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	
	public void methodB(){
		
	}
	
}
