package com.chapter1.demo01;

/**
 * 判断线程是否停止  interrupted 第二次调用会清除停止状态
 * @author Administrator
 *
 */
public class Run2 {

	public static void main(String[] args) {

		Thread.currentThread().interrupt();

		System.out.println("是否停止1?=" + Thread.interrupted());
		System.out.println("是否停止2?=" + Thread.interrupted());

		System.out.println("end!");

	}
}
