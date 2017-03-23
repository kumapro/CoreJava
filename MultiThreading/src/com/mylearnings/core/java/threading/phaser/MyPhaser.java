package com.mylearnings.core.java.threading.phaser;

import java.util.concurrent.Phaser;

public class MyPhaser extends Phaser {

	public static void m1() {
		MyPhaser phaser = new MyPhaser();
		Tourist[] tourists = new Tourist[3];
		for (int i = 0; i < tourists.length; i++) {
			tourists[i] = new Tourist(phaser);
			phaser.register(); // either register as any party gets added to the
								// list
		}
		// or resister n number of parties where n equals to the number of party
		// present in list.
		// phaser.bulkRegister(tourists.length);
		Thread[] threads = new Thread[tourists.length];
		for (int i = 0; i < tourists.length; i++) {
			threads[i] = new Thread(tourists[i], "Tourist " + i);
			threads[i].start();
		}

		// sleep for specified amount of time just to give ample amount of time
		// to complete other parties.
		try {
			Thread.sleep(35000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Journy to Mount Everest, Phaser termination status %s \n ", (phaser.isTerminated()));
	}

	@Override
	protected boolean onAdvance(int phase, int registeredParties) {
		switch (phase) {
		case 0:
			return touristCheckin();
		case 1:
			return baseCamp();
		case 2:
			return pointG453();
		case 3:
			return pointEverest();
		default:
			return true;

		}
	}

	private boolean touristCheckin() {
		System.out.println("Journy is about to start, tourists are ready....");
		System.out.printf("We have %d tourist \n", getRegisteredParties());
		return false;
	}
	
	private boolean baseCamp() {
		System.out.println("All the tourists have reached the baseCamp");
		System.out.printf("Let's start for pointG543 \n");
		return false;
	}
	
	private boolean pointG453() {
		System.out.println("All the tourists have reached the pointG543");
		System.out.printf("Let's start for Everest \n");
		return false;
	}
	
	private boolean pointEverest() {
		System.out.println("All the tourists have reached the Everest");
		System.out.printf("Enjoy the view and have chiled bear \n");
		return true;
	}
	
}
