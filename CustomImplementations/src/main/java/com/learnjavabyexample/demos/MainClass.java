package com.learnjavabyexample.demos;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class MainClass {
	static int i = 2;
	public static void main(String[] args) {
		
		
		Integer ssize = 2;
		while (ssize < 3) {
			ssize <<= 1;
		}
		System.out.println(ssize);
		
		System.out.println(1 << 30);
		
		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<>(10, 0.75f, 3);
		chm.put("1", "One");
		chm.put("2", "two");
		chm.put("3", "three");
		chm.put("4", "Four");
		
		for(Entry<String,String> entry : chm.entrySet()){
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
	}

}
