package com.chapter1.demo09;


/**
 * suspend��resume����ȱ��--��ռ
 * @author Administrator
 *
 */
public class Run {

	public static void main(String[] args ){
		
		try {
			final SynchronizedObject object = new SynchronizedObject();
			Thread thread1 = new Thread(){
				public void run(){
					object .printString();
				}
			};
			
			thread1.setName("a");
			thread1.start();
			
			Thread.sleep(1000);
			
			
			Thread thread2 = new Thread(){
				public void run(){
					System.out.println("thread2�����ˣ������벻�� printSring()����!ֻ��ӡһ��bgin");
					System.out.println("��ΪpringString() ������ a�߳�����������Զ suspend��ͣ��!");
					
					object .printString();
				}
			};
			
			thread2.start();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}

