package com.java.udemy;

import java.util.concurrent.atomic.AtomicInteger;

class Worker extends Thread{
	
	public volatile boolean isTerminated=false; 
	
	public AtomicInteger i=new AtomicInteger(0);
	
	public void run() {
		
		while (!isTerminated) {
			System.out.println("Worker Running");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public boolean isTerminated() {
		return isTerminated;
	}

	public void setTerminated(boolean isTerminated) {
		this.isTerminated = isTerminated;
	}
	
	
}


public class VolatileAndAtomicIntegerExample05 {

	public static void main(String[] args) throws InterruptedException {
		
		Worker t1=new Worker();
		
		t1.start();
		
		Thread.sleep(1000);
		t1.setTerminated(true);
		
		/*
		 * It might work here without using volatile since it is saving flag
		 * isTerminated to RAM instead of cache But if it will be saving it to cache
		 * then it will go in never ending loop without volatile
		 */
		
		System.out.println("Main Finished");
	}

}
