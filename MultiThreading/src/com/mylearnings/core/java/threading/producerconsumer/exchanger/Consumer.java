package com.mylearnings.core.java.threading.producerconsumer.exchanger;

import java.util.concurrent.Exchanger;

public class Consumer implements Runnable {

	Exchanger<String> exchanger;
	String str;

	Consumer(Exchanger<String> exchanger) {
		this.exchanger = exchanger;
	}

	public void run() {
		while(true) {
			try {
				str = exchanger.exchange(new String());
				System.out.println("CONSUMED : " + str);
//				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
