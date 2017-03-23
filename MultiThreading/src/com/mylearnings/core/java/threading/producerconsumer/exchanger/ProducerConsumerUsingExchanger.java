package com.mylearnings.core.java.threading.producerconsumer.exchanger;

import java.util.concurrent.Exchanger;

public class ProducerConsumerUsingExchanger {

	public static void main(String[] args) {

		Exchanger<String> exchanger = new Exchanger<String>();
		System.out.println("Exchanger has been created.....\n");
		
		Producer producer = new Producer(exchanger);
		Consumer consumer = new Consumer(exchanger);
		
		Thread thrd1 = new Thread(producer, "Producer");
		Thread thrd2 = new Thread(consumer, "Consumer");
		
		thrd1.start();
		thrd2.start();
		
		
	}

}
