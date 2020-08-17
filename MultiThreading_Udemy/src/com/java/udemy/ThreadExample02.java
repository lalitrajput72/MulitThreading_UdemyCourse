package com.java.udemy;

class Runners1 implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runner1: "+i);
		}
	}
}

class Runners2 implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runner2 :"+i);
		}
	}
}

public class ThreadExample02 {


	public static void main(String[] args) {
	
		Thread t1=new Thread(new Runners1());
		Thread t2=new Thread(new Runners2());
	
		t1.start();
		t2.start();
	}
	
}
