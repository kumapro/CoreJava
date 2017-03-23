package com.mylearnings.core.java.threading.evenodd2;

public class EvenGenerator implements Runnable {

	private Object lock;

	public EvenGenerator(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		for (int itr = 2; itr < 51; itr = itr + 2) {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " generated :" + itr);
                try {
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

	}

}
