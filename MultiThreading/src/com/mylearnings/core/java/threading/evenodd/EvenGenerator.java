package com.mylearnings.core.java.threading.evenodd;

public class EvenGenerator implements Runnable {

	@Override
	public void run() {
		int i = 2;
//		while(true){
		for(; i<= 20; ){
			System.out.println(Thread.currentThread().getName() + " generated: " + i);
			i +=2;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
