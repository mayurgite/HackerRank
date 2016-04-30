package com.io.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFileOfDesiredType {

	public static void main(String[] args) {

		try {
			File file = new File("C:\\Users\\abc\\Desktop\\Files\\test.bat");
			boolean value = file.createNewFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		 
	}

}
