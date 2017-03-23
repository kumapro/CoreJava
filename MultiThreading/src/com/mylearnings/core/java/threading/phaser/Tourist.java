package com.mylearnings.core.java.threading.phaser;

import java.util.Date;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

public class Tourist implements Runnable{
	Phaser phaser;
	public Tourist(Phaser phaser) {
		this.phaser = phaser;
	}
	@Override
	public void run() {
		System.out.printf("%s: Checks in for Journey to Everest.	%s\n ", Thread.currentThread().getName(), new Date());
		phaser.arriveAndAwaitAdvance();
		System.out.printf("%s: Proceding for Base Camp.	%s\n ", Thread.currentThread().getName(), new Date());
		wait1();
		System.out.printf("%s: Reached Base camp.	%s\n ", Thread.currentThread().getName(), new Date());
//		phaser.arrive();
		phaser.arriveAndAwaitAdvance();
		System.out.printf("%s: Starting for PointG453	%s\n ", Thread.currentThread().getName(), new Date());
		wait1();
		System.out.printf("%s: Reached PointG453.	%s\n ", Thread.currentThread().getName(), new Date());
		phaser.arriveAndAwaitAdvance();
		System.out.printf("%s: Begining for summit... Mount Everest. 	%s\n ", Thread.currentThread().getName(), new Date());
		wait1();
		System.out.printf("%s: Reached Mount Everest.	%s\n ", Thread.currentThread().getName(), new Date());
	}
	
	private void wait1() {
		try{
			long duration = (long) (Math.random() * 10);
			TimeUnit.SECONDS.sleep(duration);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	

	
}
