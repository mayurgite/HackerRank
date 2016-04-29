package com.oc.inheritanceHelp;

import com.oc.inheritance.VariableInheritance;

public class VarInhertanceTest /*extends VariableInheritance*/{

	public static void main(String[] args) {
		VarInhertanceTest test = new VarInhertanceTest();
		test.print();
	}
	public void print(){
		VariableInheritance inheritance = new VariableInheritance();
		
		//System.out.println("Value of i = "+inheritance.i);
	}
}
/*
 * Protected variable have little flexible nature when it comes to inheritance, although we read that Protected variables
 * are Package level i.e only classes in that package can access protected variables, but child class can access protected
 * variables of parent class although Parent class is in different package. 
 * */
