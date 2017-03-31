package com.mylearnings.core.java.programs.beginer;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 4, 5, 6, 6};
		int[] brr = removeDuplicate(arr);
		
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " ");
		}
	}

	private static int[] removeDuplicate(int[] arr) {
		int prev = arr[0];
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			if(prev == arr[i]){
				for (j = i; j < arr.length -1; j++) {
					arr[j] = arr[j+1];
				}
				arr[j] = 0;
			}
			prev = arr[i];
		}
		return arr;
	}

}
