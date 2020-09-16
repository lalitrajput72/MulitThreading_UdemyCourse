package com.java.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ThreadOne implements Callable<Integer>{

	@Override
	public Integer call() {
		System.out.println("Thread One");
		return 1;
	}
}

class ThreadTwo implements Callable<String>{

	@Override
	public String call() {
		System.out.println("Thread Two");
		return "Two";
	}
}

public class ExecutorFrameowrkDemo {

	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(2);
		
		//executorService.execute(new ThreadOne());
		//executorService.execute(new ThreadTwo());
		
		Future<Integer> futureOne=executorService.submit(new ThreadOne());
		Future<String> futureTwo=executorService.submit(new ThreadTwo());
		futureTwo.cancel(true);
		
		if(futureOne.isDone()) {
			System.out.println("Future One completed");
		}
		
		if(futureTwo.isCancelled()) {
			System.out.println("Futrure Two Cancelled");
		}
		
	}
	
}
