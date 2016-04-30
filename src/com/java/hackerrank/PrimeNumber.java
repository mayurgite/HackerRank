package com.java.hackerrank;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		PrimeNumber.findPrimeNumbers();
	}
	
	public static void findPrimeNumbers(){
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number upto which you want to find prime number:: ");
		
		int num = sc.nextInt();
		sc.nextLine();
		
		int[] numbers = new int[num];
		
		for (int i = 2; i < num; i++) // Initialize Array with 1
			numbers[i] = 1;
		
		numbers[0] = 0;
		numbers[1] = 0;
		
		
		for (int i = 1; i <= Math.sqrt(num); i++) {
			for(int j = 0; j < num; j++){
				if(i*j < num)
					numbers[i*j] = 0;
			}
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 1)
				System.out.print(i+" ");
		}
	}
}
