package com.java.iniblockes;

public class InitBlocks {
	
	
	int x; 
	
	{
		System.out.println("First member ever who is going to call ");
	}
	public InitBlocks() {
		System.out.println("Value of x = "+x);
	}
	
	{
		System.out.println("I am calling before constructor");
		x = 19;
	}
	
	public static void main(String[] args) {
		int y = 0;
		
		{
			System.out.println("I am calling before method's other callings");
			y = 10;
		}
		
		System.out.println("Nomal methos call");
		InitBlocks blocks = new InitBlocks();
	}
}
