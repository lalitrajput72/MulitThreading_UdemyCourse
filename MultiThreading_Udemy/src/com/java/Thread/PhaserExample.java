package com.java.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

public class PhaserExample {

	public static void main(String[] args) {

		ExecutorService executor=Executors.newFixedThreadPool(4);
		Phaser phaser=new Phaser(4);
		
		executor.submit(new PhaserTask(1000,phaser));
		executor.submit(new PhaserTask(2000,phaser));
		executor.submit(new PhaserTask(3000,phaser));
		executor.submit(new PhaserTask(4000,phaser));
		
		phaser.awaitAdvance(1);
		
		System.out.println("All Task Completed");
	}

}
