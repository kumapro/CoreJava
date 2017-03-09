package com.learnjavabyexample.core.genericobjectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author pmis23
 *
 */
public abstract class ObjectPool<T> implements ObjectFactory<T>, Pool<T> {

	private int size;
	private boolean isShutdown;
	private BlockingQueue<T> objects;

	public ObjectPool(int size) {
		this.size = size;
		this.isShutdown = false;
		init();
	}

	private void init() {
		objects = new LinkedBlockingQueue<>(size);
		for (int i = 0; i < size; i++) {
			T newObj = createNew();
			if(newObj != null){
				objects.add(newObj);
			}
		}
	}

	@Override
	public T get() {
		if(! isShutdown){
			T obj = null;
			try {
				obj = objects.take();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return obj;
		}
		throw new IllegalStateException("Pool is already shutdown..");
	}

	@Override
	public void release(T object) {
		if(object != null){
			objects.offer(object);
		}
	}

	@Override
	public void shutdown() {
		objects.clear();
	}

	public int size() {
		return objects.size();
	}

}
