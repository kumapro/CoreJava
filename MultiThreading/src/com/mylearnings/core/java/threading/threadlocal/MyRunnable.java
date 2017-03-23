package com.mylearnings.core.java.threading.threadlocal;

import java.util.Random;

public class MyRunnable implements Runnable {

	private ThreadLocal<String> threadLocal = new ThreadLocal<>();

	@Override
	public void run() {
		// There will be only one element per thread in LocalThread. No matters how many elements has been added.
		// it simply use to set the value in ThreadLocalMap where key is thread itself.
		threadLocal.set(Thread.currentThread().getName() + " generates " + new Random().nextInt(100));
		threadLocal.set(Thread.currentThread().getName() + " generates " + new Random().nextInt(100));
		threadLocal.set(Thread.currentThread().getName() + " generates " + new Random().nextInt(100));
		threadLocal.set(Thread.currentThread().getName() + " generates " + new Random().nextInt(100));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(threadLocal.get());
		System.out.println(threadLocal.get());
		System.out.println(threadLocal.get());
	}

}
