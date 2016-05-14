package com.java.hackerrank;

public class Sample {

	public static void main(String[] args) {
		Sample simple = new Sample();
		Integer i = new Integer(5);
		String str = "My string";
		System.out.println(simple);
		System.out.println(i);
		System.out.println(str);
	}
	public String toString(){
		return "Overriden toString() of Object class";
	}

}
