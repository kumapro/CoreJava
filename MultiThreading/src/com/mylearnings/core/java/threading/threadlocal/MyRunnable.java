package com.mylearnings.core.java.threading.threadlocal;

import java.util.Random;

public class MyRunnable implements Runnable {

//	private ThreadLocal<String> threadLocal = new ThreadLocal<>();
	
	private ThreadLocal<String> threadLocalInitialVal = new ThreadLocal<String>(){
		@Override
		protected String initialValue() {
	        return "This is the initial value";
	    }
	};

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() + " initial value:- " +threadLocalInitialVal.get());
		// There will be only one element per thread in LocalThread. No matters how many elements has been added.
		// it simply use to set the value in ThreadLocalMap where key is thread itself.
		threadLocalInitialVal.set("Thread " +Thread.currentThread().getName() + " generates " + new Random().nextInt(100));
		threadLocalInitialVal.set("Thread " +Thread.currentThread().getName() + " generates " + new Random().nextInt(100));
		threadLocalInitialVal.set("Thread " +Thread.currentThread().getName() + " generates " + new Random().nextInt(100));
		threadLocalInitialVal.set("Thread " +Thread.currentThread().getName() + " generates " + new Random().nextInt(100));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(threadLocalInitialVal.get());
		System.out.println(threadLocalInitialVal.get());
		System.out.println(threadLocalInitialVal.get());
	}

}
