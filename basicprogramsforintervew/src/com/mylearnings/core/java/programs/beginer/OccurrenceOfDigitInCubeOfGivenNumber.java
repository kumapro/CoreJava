package com.mylearnings.core.java.programs.beginer;

public class OccurrenceOfDigitInCubeOfGivenNumber {

	public static void main(String[] args) {
		int num = 1231;
		System.out.println(" the cube of " + num + " is " + num * num * num );
		int digit = 2;
		int count = findNumberOfOccurrences(num, digit);
		System.out.println("In cube of " + num + " " + digit + " occured " + count + " times");

	}

	private static int findNumberOfOccurrences(int num, int digit) {
		int count = 0;
		int cube = num * num * num;
		while(cube > 0){
			if(cube % 10 == digit){
				count++;
			}
			cube /=10;
		}
		return count;
	}

}
