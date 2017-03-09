package com.learnjavabyexample.core.customimplementation.blockingq;

import java.util.LinkedList;
import java.util.List;

public class CustomLinkedBlockingQ<E> implements CustomBlockingQ<E> {

	private List<E> queue;
	private int maxSize;

	public CustomLinkedBlockingQ(int maxSize) {
		this.maxSize = maxSize;
		queue = new LinkedList<>();
	}

	@Override
	public synchronized void put(E item) throws InterruptedException {
		if (queue.size() == maxSize) {
			this.wait();
		}
		queue.add(item);
		System.out.println(item + " added");
		this.notifyAll();
	}

	@Override
	public synchronized E take() throws InterruptedException {
		if (queue.size() == 0) {
			this.wait();
		}
		E element = queue.remove(0);
		this.notifyAll();
		System.out.println(element + " taken out");
		return element;
	}

}
