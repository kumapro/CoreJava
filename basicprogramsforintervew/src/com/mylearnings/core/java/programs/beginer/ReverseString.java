package com.mylearnings.core.java.programs.beginer;

public class ReverseString {

	public static void main(String[] args) {
		String str = "raman";
//		String revStr = reverseWithoutStringBuffer(str);
		String revStr = reverseStringUsingStringBuffer(str);
		System.out.println(revStr);

	}

	private static String reverseWithoutStringBuffer(String str) {
		// traversing string char by char and putting data in reverse order
		
		/*char[] arr = new char[str.length()];
		for(int j = 0,i = str.length() -1 ; i >= 0 ; i--, j++){
			arr[j] = str.charAt(i);
		}*/
		
		// using array created from string.
		char[] arr = str.toCharArray();
		for(int i = 0 ; i < arr.length / 2 ; i++){
			char temp = arr[i];
			arr[i] = arr[arr.length -i -1];
			arr[arr.length -i-1] = temp;
		}
		
		return new String(arr);
	}
	
	public static String reverseStringUsingStringBuffer(String str){
		return new StringBuffer(str).reverse().toString();
	}

}
