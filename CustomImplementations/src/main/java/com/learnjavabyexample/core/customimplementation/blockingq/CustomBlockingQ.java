package com.learnjavabyexample.core.customimplementation.blockingq;

public interface CustomBlockingQ<E> {

	public void put(E item) throws InterruptedException;
	public E take() throws InterruptedException;
}
