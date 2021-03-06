package com.mylearnings.core.java.threading.producerconsumer.wtntfy;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerTest {

	public static void main(String[] args) {
		Queue<Integer> buffer = new LinkedList<>();
        int maxSize = 10;
        
        Thread producer = new Thread(new Producer(buffer, maxSize));
        Thread consumer = new Thread(new Consumer(buffer, maxSize));
        
        producer.start();
        consumer.start();

	}

}
