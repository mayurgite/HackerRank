package com.java.Enums;

enum Access {
	PUBLIC("Public"),PRIVATE("Private"),POTECTED("Protected");
	
	private String access;
	
	private Access(String s) {
		this.access = s;
	}
	String getAccess(){
		return access;
	}
};

public class EnumTest {

	public static void main(String[] args) {
		String access = Access.valueOf("PRIVATE").getAccess();
		System.out.println("Access = "+access);
	}
	
	public static void test(){
		System.out.println("I am too like main() method!!!!");
	}
}

class Test{
	
}