package com.home.preparations;

import java.util.Scanner;

class CharorNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character");
		String str = scan.next();
		char c1 = str.charAt(0);
		
		if((c1 >= 'A' && c1 <= 'z') || (c1 >= 'a' && c1<= 'z')) {
			System.out.println( c1 + " is an alphabet");
		}
		else
		{
			System.out.println( c1 + " is not an alphabet");
		}
		
		
	}
}
