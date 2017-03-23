package com.mylearnings.core.java.threading.threadlocal;

public class TestThreadLocal {

	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		
		Thread t1 = new Thread(runnable, "One");
		Thread t2 = new Thread(runnable, "Two");
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
