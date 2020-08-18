package com.java.udemy.jenkov;

class MyMisxedClass {
	
	public static Object object=null;
	
	public static void setObject(Object o) throws InterruptedException {
		synchronized (MyMisxedClass.class) {
			object=o;
			Thread.sleep(3000);
			System.out.println("Static Object has been set");
		}
	}
	
	public Object instanceObject;
	
	public void setInstanceObject(Object o) {
		synchronized (this) {
			this.instanceObject=o;
			System.out.println("Instance Object has been set");
		}
	}
}

public class MixedSynchronization {
	
	public static void main(String[] args) {
	
		MyMisxedClass instance=new MyMisxedClass();
		
		Thread t1=new Thread(()->{
			try {
				MyMisxedClass.setObject("Static Object Set");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		Thread t2=new Thread(()->{
			instance.setInstanceObject("Instance Object Set");
		});
		
		t1.start();
		t2.start();
	}
}

