package com.techgig.challenges;

import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String B = "";
		String[] str = A.split(" ");

		if (str.length > 1) {
			A = str[0];
			B = str[1];
		} else {
			B = sc.nextLine();
		}
		System.out.println(A.length() + B.length());
		
        if (A.compareTo(B)> 0)
			System.out.println("Yes");
		else
			System.out.println("No");
		
        Character.valueOf(A.charAt(0));
		
        System.out.print(A.replace(A.charAt(0),Character.toUpperCase(A.charAt(0))));
		System.out.print(" "+ B.replace(B.charAt(0), Character.toUpperCase(B.charAt(0))));

	}
}