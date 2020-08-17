package com.java.udemy;

class Task1 implements Runnable{
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("Task1 : "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Task2 implements Runnable{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Task2 : "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class JoinAndYieldExample04 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException{
		
		Thread t1 =new Thread(new Task1());
		Thread t2=new Thread(new Task2());
		
		t1.start();
		t2.start();
		
		//t1.join();
		//t2.join();
		t1.yield();
		
		System.out.println("Main Finished");
	}

}
