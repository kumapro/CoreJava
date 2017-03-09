package com.learnjavabyexample.core.worker;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Worker implements Runnable {
	
	private BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(1);
	
	private Worker next = null;
	
	public void setNext(Worker next) {
		this.next = next;
	}
	
	public void accept(Integer number){
		queue.add(number);
	}

	@Override
	public void run() {
		 while (true) {
			 try{
				 int number  = queue.take();
				 System.out.println(Thread.currentThread().getName() + " producess " + number);
				 if(next != null){
					 next.accept(++number);
				 }
			 }catch (Exception e) {
				 System.out.println(Thread.currentThread().getName() + " interrupted ");
			}
		}
	}
}
