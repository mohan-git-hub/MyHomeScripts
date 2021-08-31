package com.home.preparations;

import java.util.Scanner;

public class FindingASCII {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the input Character");
		String str = input.next();
		char ch = str.charAt(0);
				
		int ascii = (int)ch;
		int ascii1 = ch;
		char a = 'a';
		int charascii = (int)a;
		
		System.out.println("ASCII value of test character is " + charascii);
		
		System.out.println("ASCII value of input character is " + ascii);
		System.out.println("ASCII value of input character is " + ascii1);
	}
}
