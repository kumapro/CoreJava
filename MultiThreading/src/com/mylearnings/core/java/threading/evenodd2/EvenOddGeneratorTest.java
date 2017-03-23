package com.mylearnings.core.java.threading.evenodd2;

public class EvenOddGeneratorTest {

	public static void main(String[] args) {
		Object lock = new Object();
			
		Thread evenGenerator = new Thread(new EvenGenerator(lock), "Even Generator");
		Thread oddGenerator = new Thread(new OddGenerator(lock), "Odd Generator");
		
		oddGenerator.start();
		evenGenerator.start();
		
		
		try {
			evenGenerator.join();
			oddGenerator.join();
			for(int i=0 ; i<1000; i++){
				new String(" " + i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Finished the execution of test generator class");
		
		
		/*Thread t1 = new Thread(new Runnable() {
            public void run() {

                for (int itr = 1; itr < 51; itr = itr + 2) {
                    synchronized (lock) {
                        System.out.println(" " + itr);
                        try {
                            lock.notify();
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {

                for (int itr = 2; itr < 51; itr = itr + 2) {
                    synchronized (lock) {
                        System.out.println(" " + itr);
                        try {
                            lock.notify();
                            if(itr==50)
                                break;
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println("\nPrinting over");
        } catch (Exception e) {

        }*/

	}

}
