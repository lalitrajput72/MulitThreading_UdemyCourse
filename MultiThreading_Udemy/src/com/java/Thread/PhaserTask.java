package com.java.Thread;

import java.util.concurrent.Phaser;

public class PhaserTask implements Runnable {

	private int delay;
	private Phaser phaser;
	
	public PhaserTask(int delay,Phaser phaser) {
		this.delay=delay;
		this.phaser=phaser;
	}

	public void run() {
		
		try {
		Thread.sleep(delay);
		phaser.arrive();
		System.out.println(Thread.currentThread().getName()+" : finished");
		}
		catch (InterruptedException e) {
			System.out.println("Interrupted Exceptions");
		} 
	}
}
