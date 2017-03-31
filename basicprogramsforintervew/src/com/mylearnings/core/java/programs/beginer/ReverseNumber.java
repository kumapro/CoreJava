package com.mylearnings.core.java.programs.beginer;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 1255534;
		int revrse = reverseNumber(number);
		System.out.println(revrse);

	}

	public static int reverseNumber(int number) {
		int result = 0;
		while(number > 0){
			result = result * 10  + number % 10;
			number /= 10; 
		}
		return result;
	}

}
