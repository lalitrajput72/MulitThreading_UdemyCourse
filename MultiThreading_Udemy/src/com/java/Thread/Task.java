package com.java.Thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Task implements Runnable {
	
	private int delay;
	private CyclicBarrier barrier;
	
	public Task(int delay,CyclicBarrier barrier) {
		this.delay=delay;
		this.barrier=barrier;
	}

	public void run() {
		
		try {
		Thread.sleep(delay);
		barrier.await();
		System.out.println(Thread.currentThread().getName()+" : finished");
		}
		catch (InterruptedException e) {
			System.out.println("Interrupted Exceptions");
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
