package com.mylearnings.core.java.programs.beginer;

public class FibonaciSeries {

	public static void main(String[] args) {
		int prev = 0;
		int curr = 1;
		int temp = 0;
		System.out.print(prev + " " + curr + " ");
		for (int i = 0; i < 10; i++) {
			temp = prev + curr;
			prev = curr;
			curr= temp;
			System.out.print(curr + " ");
		}
	}
}
