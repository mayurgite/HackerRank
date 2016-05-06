package com.java.operators;

public class DefaultOperationDataType {

	public static void main(String[] args) {
		long l = 10L + 20L;
		byte b = 10;
		byte b1 = 20;
		//byte sum = b1 + b;
		
		short s = 10;
		short s1 = 20;
		//short result = s + s1;
		System.out.println("Result = "+(b + s));
		System.out.println("Result = "+(10.23 + 20.36f));
		
		int a = 10; double b2 = 20.90;
		
		System.out.println("Result = "+(a + b2));
	}

}
