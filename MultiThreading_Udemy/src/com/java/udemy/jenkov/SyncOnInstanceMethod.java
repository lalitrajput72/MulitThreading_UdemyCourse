package com.java.udemy.jenkov;


class SynchronizationExchanger {
	
	public Object object=null;
	
	public synchronized void setObject(Object o) {
		this.object=o;
	}
	
	public void setSyncBlockbject(Object o) {
		synchronized (this) {
			this.object=o;
		}
	}
	
	public synchronized Object getObject() {
		return this.object;
	}
	
	public Object getSyncBlockObject() {
		synchronized (this) {
			return this.object;	
		}
	}
	
}

public class SyncOnInstanceMethod{
	
	public static void main(String[] args) {
		
		SynchronizationExchanger exchange=new SynchronizationExchanger();
		
		Thread t1=new Thread(()->{
			for (int i = 0; i < 100; i++) {
				exchange.setObject(""+i);
			}
		});
		
		Thread t2=new Thread(()->{
			for (int i = 0; i < 100; i++) {
				System.out.println(exchange.getObject());
			}
		});
		
		t1.start();
		t2.start();
		
	}
}