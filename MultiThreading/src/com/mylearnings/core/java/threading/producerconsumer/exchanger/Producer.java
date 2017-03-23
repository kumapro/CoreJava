package com.mylearnings.core.java.threading.producerconsumer.exchanger;

import java.util.concurrent.Exchanger;

public class Producer implements Runnable {

	Exchanger<String> exchanger;
	String str;

	public Producer(Exchanger<String> exchanger) {
		this.str = new String();
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		int i = 0;
		while(true){
			str += ++i;
			System.out.println("Produced : " + i);
			try {
				str = exchanger.exchange(str);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
