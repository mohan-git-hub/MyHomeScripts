package com.mypractice;

import java.io.File;
import java.io.FileOutputStream;

public class CreateFile {

	public static void main(String[] args) {
		try {
			File ff = new File("G:\\Mohan\\Selenium_Software\\WorkSpace\\MyHome\\TestExcel.txt");
			if(ff.createNewFile()) {
				System.out.println("File Created");
				String str="success"; 
			FileOutputStream FOS = new FileOutputStream(ff);
			FOS.write(str.getBytes());
			FOS.close();
			}
			else
			{
				System.out.println("File alreadty Exists");
			}
		}
		catch(Exception e) {
			
		}
	}
	
}
