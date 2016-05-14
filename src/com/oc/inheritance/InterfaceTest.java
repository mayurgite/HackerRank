package com.oc.inheritance;

public class InterfaceTest extends Parent {

	InterfaceTest(){
		
	}
	
	public static void main(String[] args) {
		
	}
}

class Parent{
	
	public void parentClassMethod(){
		
	}
	public String parentStringClass(){
		return null;
		
	}
}

class Child extends InterfaceTest implements TestInterface{

	@Override
	public void test() {
		// When we implements any interface then compiler first search for the defined method in that perticular  
	}
	
}

