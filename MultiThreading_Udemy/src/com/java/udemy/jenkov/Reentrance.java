package com.java.udemy.jenkov;

public class Reentrance {

	
	public synchronized int inc(int number) {
		return ++number;
	}
	
	public synchronized int incrementAndGet(int number) {
		return inc(number);
	}
	
	public static void main(String[] args) {
		
		Reentrance reentrance=new Reentrance();
		
		Thread t1=new Thread(()->{
			System.out.println(reentrance.incrementAndGet(10));
		});
		
		t1.start();
	}

}
