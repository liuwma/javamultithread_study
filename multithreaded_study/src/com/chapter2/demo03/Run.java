package com.chapter2.demo03;

/**
 * 1) A�߳��ȳ���object�����lock ����B�߳̿������첽�ķ�ʽ����ojbect�� ��syhchronized����
 * 2) A�߳��ȳ���object�����lock ����B�̵߳���ojbect�� syhchronized����ʱ ֻ���Ŷ�
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