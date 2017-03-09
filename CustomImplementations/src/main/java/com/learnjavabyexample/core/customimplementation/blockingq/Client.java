package com.learnjavabyexample.core.customimplementation.blockingq;

public class Client {

	public static void main(String[] args) {
		CustomLinkedBlockingQ<String> clbq = new CustomLinkedBlockingQ<>(5);
		
		Producer producer = new Producer(clbq);
		Consumer consumer = new Consumer(clbq);
		
		new Thread(producer, "Producer").start();;
		new Thread(consumer, "consumer").start();;
		
		

	}

}
