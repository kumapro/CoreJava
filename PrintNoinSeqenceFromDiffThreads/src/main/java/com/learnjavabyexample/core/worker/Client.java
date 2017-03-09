package com.learnjavabyexample.core.worker;

public class Client {

	public static void main(String[] args) {
		 
		Worker worker1 = new Worker();
		Worker worker2 = new Worker();
		Worker worker3 = new Worker();
		Worker worker4 = new Worker();
		Worker worker5 = new Worker();
		Worker worker6 = new Worker();
		Worker worker7 = new Worker();
		Worker worker8 = new Worker();
		Worker worker9 = new Worker();
		Worker worker10 = new Worker();
		
		worker1.setNext(worker2);
		worker2.setNext(worker3);
		worker3.setNext(worker4);
		worker4.setNext(worker5);
		worker5.setNext(worker6);
		worker6.setNext(worker7);
		worker7.setNext(worker8);
		worker8.setNext(worker9);
		worker9.setNext(worker10);
		
		worker1.accept(1);
		
		new Thread(worker1, "worker1").start();
		new Thread(worker2, "worker2").start();
		new Thread(worker3, "worker3").start();
		new Thread(worker4, "worker4").start();
		new Thread(worker5, "worker5").start();
		new Thread(worker6, "worker6").start();
		new Thread(worker7, "worker7").start();
		new Thread(worker8, "worker8").start();
		new Thread(worker9, "worker9").start();
		new Thread(worker10, "worker10").start();
		
	}

}
