package com.java.hackerrank;

import java.util.*;
import java.io.*;

public class DatatypesAllocation{
	public static void main(String []argh){
		
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
        sc.nextLine();
       
		for (int k = 0; k < testCases; k++) {
            
            String[] dataTypes = new String[10];
            String t = sc.nextLine();
			byte b;
			short s;
			int i;
			long l;
            boolean flag = false;
			try {
				b = Byte.parseByte(t);
				dataTypes[0] = "* byte";
				dataTypes[1] = "* short";
				dataTypes[3] = "* int";
				dataTypes[4] = "* long";
			} catch (NumberFormatException e) {
				try {
					s = Short.parseShort(t);
					dataTypes[0] = "* short";
					dataTypes[1] = "* int";
					dataTypes[2] = "* long";
				} catch (NumberFormatException ex) {
					try {
						i = Integer.parseInt(t);
						dataTypes[0] = "* int";
						dataTypes[1] = "* long";
					} catch (NumberFormatException nfe) {
						try {
							l = Long.parseLong(t);
							dataTypes[4] = "* long";
						} catch (NumberFormatException nfex) {
                            flag = true;
							System.out.println(t + " can't be fitted anywhere.");
						}
					}
				}
			}
            if(!flag){
                System.out.println(t + " can be fitted in:");
            }
			for (int j = 0; j < dataTypes.length; j++) {
				if (dataTypes[j] != null)
					System.out.println(dataTypes[j]);
			}
		}
	
	}
}
