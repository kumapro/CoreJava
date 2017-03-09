package com.learnjavabyexample.core.customimplementation.blockingq;

public class Consumer implements Runnable {

	CustomLinkedBlockingQ<String> clbq;
	
	public Consumer(CustomLinkedBlockingQ<String> clbq) {
		super();
		this.clbq = clbq;
	}

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			try {
				clbq.take();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
