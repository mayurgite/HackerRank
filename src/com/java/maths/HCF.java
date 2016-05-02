package com.java.maths;

//This java program accepts two  from
//the user and prints their HCF and LCM
import java.util.*;

public class HCF {
	public static void main(String Args[]) {
		System.out.println("Enter 2 numbers");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		long result = 0L;
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		long[] input = new long[5];
		
		input[0] = m;
		input[1] = n;
		
		for (int i = 0; i < input.length; i++) {
			result = gcd(input[i],n);
		}	
		System.out.println("Result = "+result);
		/*int h = 1;
		int p = m * n;
		for (int i = 2; i < p; i++) {
			if ((m % i == 0) && (n % i == 0)) {
				h = i;
			}
		}
		int l = p / h;
		System.out.println("HCF=" + h + " and LCM=" + l);*/
		
		
	}
	private static long gcd(long a, long b){
	    while (b > 0)
	    {
	        long temp = b;
	        b = a % b; // % is remainder
	        a = temp;
	    }
	    return a;
	}
	
	private static long gcd(long[] input)
	{
	    long result = input[0];
	    for(int i = 1; i < input.length; i++) result = gcd(result, input[i]);
	    return result;
	}
}
