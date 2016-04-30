package com.java.hackerrank;

import java.util.Scanner;

public class BasicPrimeNumberCheck {

	public static void main(String[] args) {
		System.out.println("Enter number:: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean flag = false;

		if (num % 2 != 0) {
			for (int i = 3; i < num/2 ; i++) {
				if ((num != i)) {
					if (num % i == 0) {
						flag = true;
						break;
					}
				}

			}
			
			if (flag)
				System.out.println(num + " is not prime!!");
			else
				System.out.println(num + " is prime!!");
		} else {
			System.out.println(num + " is not prime!!");
		}

	}

}
