package com.mylearnings.core.java.programs.beginer;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 407;
		System.out.println(isArmstrong(num) ? num + " is an armstrong number" : num + " is not an armstrong number" );
		swapNumbersWithoutUsingThirdVar(10, 20);
	}

	public static boolean isArmstrong(int num){
		int temp = num;
		int remainder = 0;
		int cubeOfDigits = 0;
		while(temp > 0){
			remainder = temp % 10;
			cubeOfDigits += (remainder * remainder * remainder);
			temp /= 10;
		}
		return cubeOfDigits == num;
	}
	
	public static void swapNumbersWithoutUsingThirdVar(int first, int second){
		System.out.println("first bumber " + first + " second Number " + second);
		first = first + second;
		second = first - second;
		first = first - second;
		System.out.println("first bumber " + first + " second Number " + second);
	}
}
