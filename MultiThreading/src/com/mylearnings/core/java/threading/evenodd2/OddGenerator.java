package com.mylearnings.core.java.threading.evenodd2;

public class OddGenerator implements Runnable {

	private Object lock;

	public OddGenerator(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		for (int itr = 1; itr < 51; itr = itr + 2) {
            synchronized (lock) {
            	if(itr ==1){
            		try {
    					Thread.sleep(100);
    				} catch (InterruptedException e1) {
    					// TODO Auto-generated catch block
    					e1.printStackTrace();
    				}
            	}
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
