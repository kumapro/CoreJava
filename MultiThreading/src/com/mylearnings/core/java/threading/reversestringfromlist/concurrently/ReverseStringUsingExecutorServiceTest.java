package com.mylearnings.core.java.threading.reversestringfromlist.concurrently;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ReverseStringUsingExecutorServiceTest {

	public static void main(String[] args) {
		List<String> listOfString = prepareData();
		reverseEachElement(listOfString);
	}

	private static void reverseEachElement(List<String> listOfString) {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		List<Future<String>> completedServices = new ArrayList<>();
		for (String str : listOfString) {
			Future<String> future = executor.submit(new ReverseString(str));
			completedServices.add(future);
		}

		for (Future<String> future : completedServices) {
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		executor.shutdown();
	}

	private static List<String> prepareData() {
		List<String> listOfString = new ArrayList<>();
		listOfString.add("first");
		listOfString.add("last");
		listOfString.add("name");
		listOfString.add("key");
		listOfString.add("value");
		listOfString.add("map");
		return listOfString;
	}
}
