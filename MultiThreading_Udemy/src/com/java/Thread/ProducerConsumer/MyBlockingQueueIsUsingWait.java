package com.java.Thread.ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class MyBlockingQueueIsUsingWait<E> {

	int max=16;
	private Queue<E> queue;
	private Object notFull=new Object();
	private Object notEmpty=new Object();
	
	public MyBlockingQueueIsUsingWait(int size){
		this.queue=new LinkedList<>();
		this.max=size;
	}
	
	public synchronized void put(E e) {
		try {
			while(queue.size()==max) {
				notFull.wait();
			}
			queue.add(e);
			notEmpty.notifyAll();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	} 
	
	public synchronized E take() {
		try {
			while(queue.size()==0) {
				notEmpty.wait();
			}
			E item=queue.remove();
			notFull.notifyAll();
			return item;
		} catch (InterruptedException e) {
			e.printStackTrace();
			return queue.remove();
		}
		
	}
}
