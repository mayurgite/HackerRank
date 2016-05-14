package com.techgig.challenges;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubStringChallange {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		try {
			int n = in.nextInt();
			in.nextLine();
			String B = in.next();
			System.out.println("B = "+B);
			int i = 0;
			while(B.contains("010")){
				B.replaceAll("010", "000");
	            ++i;
			}
	        System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
