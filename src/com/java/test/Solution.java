package com.java.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        String [] result = new String[t];
        
        for(int i = 0; i < t; i++){
            String str = sc.nextLine();
            
            String[] str1 = str.split(" ");
            
            if(str1.length == 3){
                
            result[i] = calculate(Integer.parseInt(str1[0]),Integer.parseInt(str1[1]),Integer.parseInt(str1[2]));   
                
            }else{
                System.out.println("Invalid input!!");
            }
        }
        
        for(int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }
    
    
    public static String calculate(int a, int b, int n){
        int result = 0;
        String finalResult = "";
        
        for(int i = 0; i < n; i++){
        	if( i == 0)
        		result = (int) (Math.pow(2, i) * b + result + a) ;    
        	else{
        		result = (int) (Math.pow(2, i) * b + result);
        	}
        	finalResult= finalResult + result+" ";
        }
        return finalResult;
    }
    /*
    static int getPowerValue(int base, int power){
        int value = 1;
        
        if(base == 0)
            value = 0;
        else{   
            while(power-- != 0){
                value = value * base;
            }
        }
        return value;
    }*/
}