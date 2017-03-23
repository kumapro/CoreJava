package com.mylearnings.core.java.threading.producerconsumer;

public class ProducerConsumer {
	
	private static Object lock = new Object();
	private static int[] buffer;
	private static int count;
	
	static class Producer{
		
		public void produce(){
			synchronized (lock) {
				if(isFull()){
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				buffer[count++] = 1;
				lock.notify();
			}
			
		}
	}
	
	static class Consumer{
		
		public void consume(){
			synchronized (lock) {
				if(isEmpty()){
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				buffer[--count] = 0;
				lock.notify();
			}	
		}
	}

	public static boolean isFull() {
		return count == buffer.length;
	}
	

	public static boolean isEmpty() {
		return count == 0;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		buffer = new int[10];
		count = 0;
		
		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		
		Runnable producerTask = () -> {
			for(int i = 0; i < 50 ; i++){
				producer.produce();
			}
			System.out.println("Production done..");
		};
		
		Runnable consumerTask = () -> {
			for(int i = 0; i < 50 ; i++){
				consumer.consume();
			}
			System.out.println("Consumption completed");
		};
		
		Thread producerThread = new Thread(producerTask);
		Thread consumerThread = new Thread(consumerTask);
		consumerThread.start();
		producerThread.start();
		consumerThread.join();
		producerThread.join();
		System.out.println("data in buffer is : " + count);
	}
}
