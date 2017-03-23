package com.mylearnings.core.java.threading.evenodd;

public class EvenOddGeneratorTest {

	public static void main(String[] args) {
		Thread evenGenerator = new Thread(new EvenGenerator(), "Even Generator");
		Thread oddGenerator = new Thread(new OddGenerator(), "Odd Generator");
		
		oddGenerator.start();
		evenGenerator.start();
		
		
		try {
			Thread.sleep(10000);
			System.out.println("finished");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
