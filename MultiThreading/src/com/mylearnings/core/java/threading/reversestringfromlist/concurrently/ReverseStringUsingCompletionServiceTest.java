package com.mylearnings.core.java.threading.reversestringfromlist.concurrently;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ReverseStringUsingCompletionServiceTest {

	public static void main(String[] args) {
		List<String> listOfString = new ArrayList<>();
		listOfString.add("first");
		listOfString.add("last");
		listOfString.add("name");
		listOfString.add("key");
		listOfString.add("value");
		listOfString.add("map");

		ExecutorService executor = Executors.newFixedThreadPool(3);
		ExecutorCompletionService<String> completionService = new ExecutorCompletionService<>(executor);

		for (String str : listOfString) {
			completionService.submit(new ReverseString(str));
		}

		// This loop is required as ExecutorCompletionService doesn't tell us
		// how many Future objects are still there waiting
		for (int i = 0; i < listOfString.size(); i++) {
			try {
				final Future<String> future = completionService.take();
				System.out.println(future.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}

		executor.shutdown();
	}
}
