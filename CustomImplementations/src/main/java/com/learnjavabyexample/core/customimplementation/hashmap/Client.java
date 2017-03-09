package com.learnjavabyexample.core.customimplementation.hashmap;

public class Client {

	public static void main(String[] args) {
		CustomHashMap<String, String> chm = new CustomHashMap<>();
		chm.put("1", "One");
		chm.put("2", "Two");
		chm.put("3", "Three");
		chm.put("4", "Four");
		chm.put("5", "Five");
		
		chm.printHashMap();
		chm.put("4", "Forty");
		chm.printHashMap();
		
		System.out.println();
		System.out.println(chm.size());
		System.out.println();
		
		System.out.println(chm.get("1"));
		System.out.println(chm.get("2"));
		System.out.println(chm.get("3"));
		System.out.println(chm.get("4"));
		System.out.println(chm.get("5"));
		
		chm.remove("3");
		
		chm.printHashMap();
		
	}

}
