package com.learnjavabyexample.core.genericobjectpool.thread;

import com.learnjavabyexample.core.genericobjectpool.ObjectPool;

public class ThreadPool extends ObjectPool<Runnable> {
	
	public ThreadPool(int size) {
		super(size);
	}

	@Override
	public Runnable createNew() {
		Thread t = new Thread();
		System.out.println("new Thread " + t + " created..");
		return t;
	}

}
