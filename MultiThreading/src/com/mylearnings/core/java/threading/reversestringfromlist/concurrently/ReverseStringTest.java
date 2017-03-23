package com.mylearnings.core.java.threading.reversestringfromlist.concurrently;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ReverseStringTest {

	public static void main(String[] args) {
		List<String> listOfString = new ArrayList<>();
		List<ReverseString> callables = new ArrayList<>();
		listOfString.add("abc");
		listOfString.add("efg");
		listOfString.add("hij");
		listOfString.add("klm");
		listOfString.add("nop");
		listOfString.add("qrst");
		
		ExecutorService executor = Executors.newFixedThreadPool(3);

		for (int i = 0; i < listOfString.size(); i++) {
			callables.add(new ReverseString(listOfString.get(i)));
		}

		try {
			for (final Future<String> future : executor.invokeAll(callables)) {
				System.out.println(future.get());
			}
		} catch (ExecutionException | InterruptedException ex) {
		}
		executor.shutdown();

	}

	static class ReverseString implements Callable<String> {
		String strToreverse;

		public ReverseString(String strToreverse) {
			this.strToreverse = strToreverse;
		}

		@Override
		public String call() throws Exception {
			return new StringBuffer(strToreverse).reverse().toString();
		}
	}

}
