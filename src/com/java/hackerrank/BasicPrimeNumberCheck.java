package com.java.hackerrank;

import java.util.Scanner;

public class BasicPrimeNumberCheck {
	
	/*public boolean isPrimeNumber(int number){
        
        for(int i=2; i <= number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
     
    public static void main(String a[]){
        BasicPrimeNumberCheck mpc = new BasicPrimeNumberCheck();
        System.out.println("Is 2 prime number? "+mpc.isPrimeNumber(2));
        System.out.println("Is 19 prime number? "+mpc.isPrimeNumber(19));
        System.out.println("Is 15 prime number? "+mpc.isPrimeNumber(15));
    }*/

	 public static void main(String[] args) {
		System.out.println("Enter number:: ");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		boolean flag = false;

		if(num == 2){
			System.out.println("Only Even prime number");
			System.exit(0);
		}
		
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
