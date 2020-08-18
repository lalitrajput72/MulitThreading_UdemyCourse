package com.java.udemy.jenkov;

class MyStaticClass {
	
	public static Object object=null;
	
	public synchronized static void setObject() throws InterruptedException {
		object="Hello";
		Thread.sleep(3000);
	}
	
	public synchronized static Object getObject() {
		return object;
	}
	
}


public class SyncOnStaticMethod {

	
	public static void main(String[] args) {
		
	Thread t1=new Thread(()->{
		try {
			MyStaticClass.setObject();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	});
	
	Thread t2=new Thread(()->{
		System.out.println(MyStaticClass.getObject());
	});
	
	t1.start();
	t2.start();
	}
}
