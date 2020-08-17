package com.java.Thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService executor=Executors.newFixedThreadPool(4);
		CountDownLatch latch=new CountDownLatch(4);
		
		executor.submit(new Worker(1000,latch));
		executor.submit(new Worker(2000,latch)); 
		executor.submit(new Worker(3000,latch));
		executor.submit(new Worker(4000,latch));
		
		latch.await();
		
		System.out.println(Thread.currentThread().getName()+" main finished");
		
	}

}
