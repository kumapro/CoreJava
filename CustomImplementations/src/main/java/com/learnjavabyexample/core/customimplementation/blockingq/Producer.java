package com.learnjavabyexample.core.customimplementation.blockingq;

public class Producer implements Runnable {

	CustomLinkedBlockingQ<String> clbq;
	
	
	public Producer(CustomLinkedBlockingQ<String> clbq) {
		this.clbq = clbq;
	}


	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			try {
				clbq.put("element " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
