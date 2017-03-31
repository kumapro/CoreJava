package com.mylearnings.core.java.programs.beginer;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {
		int number = 178851;

		int sumOfDigit = findSumOdDigit(number);
		System.out.println(sumOfDigit);
	}

	private static int findSumOdDigit(int number) {
		int result = 0;
		while(number > 0){
			result += number % 10;
			number /= 10;
		}
		return result;
	}

}
