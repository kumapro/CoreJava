package com.mylearnings.core.java.programs.beginer;

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "abac";
		System.out.println(isPalindrome(str) ? str + " is a palindrom" :  str + " is not a palindrom");
		System.out.println(isPalindromeWithoutUsingStringBuffer(str) ? str + " is a palindrom" :  str + " is not a palindrom");
	}

	public static boolean isPalindrome(String str){
		String newStr = new StringBuffer(str).reverse().toString();
		return newStr.equals(str);
	}
	
	// it's complexity is O(n/2)
	public static boolean isPalindromeWithoutUsingStringBuffer(String str){
		char[] newStr = str.toCharArray();
		for (int i = 0, j = newStr.length - 1; i < newStr.length / 2; i++, j--) {
			if(newStr[i] != newStr[j]){
				return false;
			}
		}
		return true;
	}
}
