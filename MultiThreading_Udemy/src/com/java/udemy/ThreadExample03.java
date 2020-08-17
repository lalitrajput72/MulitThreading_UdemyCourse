package com.java.udemy;

class Runnerss1 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runner1: "+i);
		}
	}
}

class Runnerss2 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runner2 :"+i);
		}
	}
}

public class ThreadExample03 {


	public static void main(String[] args) {
	
		Runnerss1 r1=new Runnerss1();
		Runnerss2 r2=new Runnerss2();
		r1.start();
		r2.start();
	}
	
}
