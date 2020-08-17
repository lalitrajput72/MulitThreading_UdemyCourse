package com.java.Thread;

import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable {

	private int delay;
	private CountDownLatch latch;
	
	public Worker(int delay,CountDownLatch latch) {
		this.delay=delay;
		this.latch=latch;
	}
	
	public void run() {
		try {
		Thread.sleep(delay);
		latch.countDown();
		System.out.println(Thread.currentThread().getName()+" finished");
		}
		catch (Exception e) {
			System.out.println("Exception Occured");
		}
	}
}
