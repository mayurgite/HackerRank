package com.java.hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FindSubstring implements Comparable<FindSubstring>{

	private int x;

	public FindSubstring(int x) {
		this.x = x;
	}

	public static void main(String[] args) {
		/*
		 * @SuppressWarnings("resource") Scanner scan = new Scanner(System.in);
		 * String inputString = scan.nextLine(); int subStrCount =
		 * scan.nextInt(); String prev = inputString.substring(0, subStrCount);
		 * String small = ""; String big = ""; for (int i = 1; i <
		 * inputString.length(); i++) { if (i + (subStrCount - 1) <
		 * inputString.length()) { String temp = inputString.substring(i, i +
		 * (subStrCount)); if (prev.compareTo(temp) > 0) { small = temp; big =
		 * prev; } else { small = prev; big = temp; } } }
		 * System.out.println(small + "\n" + big);
		 * 
		 * System.out.println(new FindSubstring().hashCode());
		 * System.out.println(prev.equals(small));
		 */	

		// FindSubstring findStr = new FindSubstring(5);
		// FindSubstring findStr1 = new FindSubstring(8);
		// String str = "Mayur"; String str1 = "Mayur";

		// System.out.println(str == str1);
		// System.out.println(str.equals(str1));
		// System.out.println("Before = "+findStr.equals(findStr1));
		// System.out.println("Before = "+(findStr == findStr1));

		// findStr = findStr1;

		// System.out.println("Before = "+findStr.equals(findStr1));
		// System.out.println("Before = "+(findStr == findStr1));
		Set<Integer> finSet = new HashSet<Integer>();
		/*FindSubstring f1 = new FindSubstring(2);
		FindSubstring f2 = new FindSubstring(5);
		FindSubstring f3 = new FindSubstring(9);
		FindSubstring f4 = new FindSubstring(77);
		FindSubstring f5 = new FindSubstring(7);*/
		/*finSet.add(9);
		finSet.add(5);
		finSet.add(12);
		finSet.add(16);
		finSet.add(7);

		for (int findSubstring : finSet) {
			System.out.println(findSubstring);
		}*/
		
	}
	
	@Override
	public int compareTo(FindSubstring o) {
		// TODO Auto-generated method stub
		return 0;
	}
}