package com.io.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class EndOfFileChallenge {

	public static void main(String[] args) {
		EndOfFileChallenge.readFile();
	}

	private static void readFile() {
		File file = null;
		FileInputStream fis = null;
		int content = 0;
		int i = 1;
		int index = 0;
		char[] characters = new char[100];
		boolean flag = true;
		try{
			file = new File("C:\\Users\\abc\\Desktop\\EndOfFileChallenge.txt");
			fis = new FileInputStream(file);
			
			while((content = fis.read()) != -1){
				char eachChar = (char)content;
			
				if(flag)
					System.out.print(i+" ");
				if(eachChar != '\n'){
					System.out.print(eachChar);
					characters[index] = eachChar;
					flag = false;
				}else{
					flag = true;
					i++;
					/*for (int j = 0; j < characters.length; j++) {
						System.out.print(characters[j]);
					}
					characters = new char[100];*/
				}
			}
			
		}catch(Exception fnf){
			fnf.printStackTrace();
		}
	}

}
