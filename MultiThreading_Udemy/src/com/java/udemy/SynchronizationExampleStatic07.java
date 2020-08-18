package com.java.udemy;

public class SynchronizationExampleStatic07 {

	public static int count1=0;
	public static int count2=0;
	
	public static Object lock1=new Object();
	public static Object lock2=new Object();
	public static Object lock3=new Object();
	
	public  static void add() throws InterruptedException {
		synchronized (lock1) {
			count1++;	
		}
	}
	
	public static void addAgain() throws InterruptedException {
		synchronized (lock2) {
			count2++;
		}
	}
	
	public static void compute() throws InterruptedException {
	synchronized (lock3) {
		for (int i = 0; i < 100; i++) {
			add();
			addAgain();
			}
		}
	}
	
	public static void main(String[] args) {

		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					compute();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					compute();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		try {
		t1.join();
		t2.join();
		}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}
		
		System.out.println("Count1 : "+count1+" , Count2 : "+count2);
	}

}
