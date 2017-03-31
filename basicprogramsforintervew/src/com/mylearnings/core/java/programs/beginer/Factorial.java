package com.mylearnings.core.java.programs.beginer;

public class Factorial {

	public static void main(String[] args) {
		int number = 5;
		int factorial = calculateFactorial(number);
		System.out.println(factorial);
	}

	private static int calculateFactorial(int number) {
		int result = 1;
		for (int i = 2; i <= number; i++) {
			result *= i;
		}
		return result;
	}

}
