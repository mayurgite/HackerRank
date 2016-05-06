package com.java.operators;

public class Assignments {
	
	Assignments(int x) {
		System.out.println("1-arg const");
	}

	Assignments() {
		System.out.println("no-arg const");
	}

	{
		System.out.println("1st instance init");
	}
	{
		System.out.println("2nd instance init");
	}
	static {
		System.out.println("1st static init");
	}
	static {
		System.out.println("2nd static init");
	}
	public static void main(String[] args) {
		//new Assignments();
		new Assignments(7);
	}

}
