package com.java.Thread;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample {

	public static void main(String[] args) {

		ExecutorService executorService=Executors.newFixedThreadPool(4);
		CyclicBarrier barrier=new CyclicBarrier(4);
		
		executorService.submit(new Task(1000,barrier));
		executorService.submit(new Task(2000,barrier));
		executorService.submit(new Task(3000,barrier));
		executorService.submit(new Task(4000,barrier));
		
		System.out.println("Main Thread finished");
	}

}
