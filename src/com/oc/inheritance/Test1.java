package com.oc.inheritance;

public class Test1 extends VariableInheritance {
	
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.print();
	}
	
	public void print(){
		System.out.println("Value is i = "+i);
	}
}
