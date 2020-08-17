package com.java.Thread.ProducerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerExample {

	public static void main(String[] args) throws InterruptedException {

		BlockingQueue<Item> blockingQueue=new ArrayBlockingQueue<>(2);
		ProducerConsumerExample ex=new ProducerConsumerExample();
		
		Runnable producer=()->{
			while(true) {
			try {
				blockingQueue.put(ex.createItem());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			}
		};
		
		new Thread(producer,"Item 1").start();;
		new Thread(producer,"Item 2").start();
 		
		Runnable consumer=()->{
			while(true) {
			try {
				ex.process(blockingQueue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		};
		
		new Thread(consumer).start();
		new Thread(consumer).start();

	}
	
	public  Item createItem() {
		System.out.println(Thread.currentThread().getName()+" Created");
		return new Item(Thread.currentThread().getName());
	}
	
	public void process(Item item) {
		System.out.println(item.getItemName()+"  Processed");
	}

}
