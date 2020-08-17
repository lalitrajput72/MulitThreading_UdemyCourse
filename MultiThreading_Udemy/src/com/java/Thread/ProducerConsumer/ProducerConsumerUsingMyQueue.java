package com.java.Thread.ProducerConsumer;

public class ProducerConsumerUsingMyQueue {

	public static void main(String[] args) {

		//MyBlockingQueue<Item> myQueue=new MyBlockingQueue<>(2);
		MyBlockingQueueIsUsingWait<Item> myQueue=new MyBlockingQueueIsUsingWait<>(2);
		ProducerConsumerUsingMyQueue pro=new ProducerConsumerUsingMyQueue();
		Runnable producer=()->{
			while(true)
			myQueue.put(pro.CreateItem());
		};
		
		new Thread(producer,"MyQueueItem One").start();
		new Thread(producer,"MyQueueItem Two").start();
		
		Runnable consumer = ()->{
		while(true)
			pro.ProcessItem(myQueue.take());
		};
		
		new Thread(consumer).start();
		new Thread(consumer).start();
	}
	
	public Item CreateItem() {
		System.out.println(Thread.currentThread().getName()+" : Created");
		return new Item(Thread.currentThread().getName());
	}
	
	public void ProcessItem(Item item) {
		System.out.println(Thread.currentThread().getName()+" : Processed");
	}

}
