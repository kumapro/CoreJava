package com.mylearnings.core.java.programs.beginer;

public class BinaryChecker {

	public static void main(String[] args) {
		int number = 1010101002;
		
		System.out.println(isBinary(number) ? number + " is binary" : number + " not is binary");;

	}

	private static boolean isBinary(int number) {
		while(number > 0){
			if(number % 10 > 1){
				return false;
			}
			number /= 10;
		}
		return true;
	}

}
