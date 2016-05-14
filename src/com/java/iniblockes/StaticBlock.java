package com.java.iniblockes;

import java.util.List;
import java.util.Scanner;

public class StaticBlock {

	static int B;
	static int H;
	static boolean flag;
	
	static{
		Scanner scan = new Scanner(System.in);
	    B = scan.nextInt(); scan.nextLine();
	    H = scan.nextInt(); scan.nextLine();
	    if((B>=0 && 100>=B) && (H>=0 && 100>=H))
	        flag = true;
		else
			try {
				throw new Exception("Test");
			} catch (Exception e) {}
	}
	public static void main(String[] args) {
		if(flag){
			System.out.println("Area = "+ B*H);
		}

	}

}
