package com.java.maths;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Nividous-19 Problem statement: Find the LCM of numbers entered using
 *         method-1. Ex. LCM(45, 78), LCM(41,12,36), LCM(8,7,5,6) etc.
 *
 *         Note: Take inputs from users.
 */
public class LCM {

	public static void main(String[] args) {

		System.out.println("Enter two numbers:: ");
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int hcf = 0, lcm = 0;
		int prod = num1 * num2;
		
		while (num1 > 0) {
			int temp = num1;
			num1 = num2 % num1;
			//Num1 wil be HCF
			num2 = temp;
		}
		lcm = prod/hcf;
		System.out.println("HCF = "+hcf + "  LCM = "+lcm);
/*		
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		SortedSet<Integer> numbers = new TreeSet<Integer>();
		List<Integer> multiples = new ArrayList<Integer>();
		String input = "";
		int result = 1;
		System.out.println("Enter numbers to find LCM:: ");

		input = scan.nextLine();
		String[] temp = new String[10];
		temp = input.split(" ");

		for (String str : temp) {
			if (str != null || str != "") {
				try {
					numbers.add(Integer.parseInt(str));
				} catch (NumberFormatException nfe) {
					System.out
							.println("Input number is invlid, putting 1 at the place of invalid number.");
					numbers.add(1);
				}
			}
		}// I have numbers
		int lastNumber = numbers.last();
		int checkLast = 0;
		try {
			while (checkLast != 1) {
				for (int i = 2; i <= lastNumber; i++) {
					List<Integer> listToRemoveNumbers = new ArrayList<Integer>();
					List<Integer> listToAddNumbers = new ArrayList<Integer>();
					for (int num : numbers) {
						if (numbers.last() != 1) {
							if (num % i == 0) {
								multiples.add(i);
								listToAddNumbers.add(num / i);
								listToRemoveNumbers.add(num);
							}
						}
					}
					for (int listElement : listToRemoveNumbers) {
						numbers.remove(listElement);
					}
					for (int listElement : listToAddNumbers) {
						numbers.add(listElement);
					}
					checkLast = numbers.last();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int res : multiples) {
			result = result * res;
		}
		System.out.println("LCM = " + result);
	*/
	}

}
