package com.mylearnings.core.java.programs.beginer;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n1 = 25;
		System.out.println(isPrime(n1)? n1 + " is Prime" : n1 + " is not prime");
		/*int n2 = 11;
		System.out.println(isPrime(n2)? n2 + " is Prime" : n2 + " is not prime");
		
		int n11 = 101;
		System.out.println(isPrime1(n11)? n11 + " is Prime" : n11 + " is not prime");
		int n12 = 110;
		System.out.println(isPrime1(n12)? n12 + " is Prime" : n12 + " is not prime");*/
		
		findAllPrimeInGivenRange(20, 30);
	}

	public static void findAllPrimeInGivenRange(int fist, int last) {
		System.out.println();
		for (int i = fist; i < last; i++) {
			if(isPrime(i)){
				System.out.print(i + " ");
			}
			
		}
	}
	public static boolean isPrime(int number) {
		for(int i = 2; i <= Math.sqrt(number); i++){
			if( number % i == 0){
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime1(int number) {
		for(int i = 2; i < number / 2; i++){
			if( number % i == 0){
				return false;
			}
		}
		return true;
	}
	
	
}
