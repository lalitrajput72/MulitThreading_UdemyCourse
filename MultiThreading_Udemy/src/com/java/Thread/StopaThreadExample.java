package com.java.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class StopaThreadExample {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService executor=Executors.newFixedThreadPool(2);
		Thread t1=new Thread(()->{
			if(!Thread.interrupted()) {
			System.out.println(Thread.currentThread().getName()+" : Executing thread");
			}
		});
		
		t1.start();
		Thread.sleep(100);
		t1.interrupt();
		
		//t1.start();
		//Future<?> future=executor.submit(t1);
		//executor.shutdownNow();
		//future.cancel(true);
		
	}

}
