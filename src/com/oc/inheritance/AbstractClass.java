package com.oc.inheritance;

public class AbstractClass extends TestAbstractClass{

	public static void main(String[] args) {
		TestAbstractClass tac = new AbstractClass();
		((AbstractClass) tac).print();
	}

	@Override
	public void test() {
		System.out.println("Implemeted test method");
	}
	
	public void print(){
		System.out.println("Just print");
	}
}

abstract class TestAbstractClass implements Tesy{
	
	public abstract void test();
}

interface Tesy{
	
}