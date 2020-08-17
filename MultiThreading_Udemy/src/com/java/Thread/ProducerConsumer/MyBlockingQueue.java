package com.java.Thread.ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<E> {

	int max=16;
	private Queue<E> queue;
	private ReentrantLock lock=new ReentrantLock(true);
	private Condition notFull=lock.newCondition();
	private Condition notEmpty=lock.newCondition();
	
	public MyBlockingQueue(int size){
		this.queue=new LinkedList<>();
		this.max=size;
	}
	
	public void put(E e) {
		lock.lock();
		try {
			while(queue.size()==max) {
				notFull.await();
			}
			queue.add(e);
			notEmpty.signalAll();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		finally {
			lock.unlock();
		}
	} 
	
	public E take() {
		lock.lock();
		try {
			while(queue.size()==0) {
				notEmpty.await();
			}
			E item=queue.remove();
			notFull.signalAll();
			return item;
		} catch (InterruptedException e) {
			e.printStackTrace();
			return queue.remove();
		}
		finally {
			lock.unlock();
		}
		
	}
}
