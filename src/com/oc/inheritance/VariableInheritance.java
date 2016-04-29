package com.oc.inheritance;

public class VariableInheritance {

	protected int i = 10;
	
	public static void main(String[] args) {
		VariableInheritance inheritance = new VariableInheritance();
		
		System.out.println("In VariableInheritance value of i = "+inheritance.i);
		
		Test t = new Test();
		t.print();
		
		Test2 t2 = new Test2();
		t2.print();
	}

}

class Test extends VariableInheritance{
	
	public void print(){
		System.out.println("In Test value of i = "+i);
	}
}

class Test2 extends Test{
	public void print(){
		System.out.println("In Test2 value of i = "+i);
	}
}