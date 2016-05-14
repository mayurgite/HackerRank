package com.io.programs;

import java.util.Scanner;

public class EOFUsingScanner {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int i = 1;
		
		while(scan.hasNext()){
			System.out.println(i+" "+scan.nextLine());
			i++;
		}
		
	}
}
