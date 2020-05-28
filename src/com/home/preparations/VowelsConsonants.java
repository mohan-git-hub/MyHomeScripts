package com.home.preparations;

import java.util.Scanner;

public class VowelsConsonants {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the character");
		
		String str = scan.next();
		char ch = str.charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Given Character is a Vowel");
		}
		else
		{
			System.out.println("Given Consonant is a Consonant");
		}
		
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Given Character is a Vowel");
		break;
		default:
			System.out.println("Given Character is a Consonant");
		break;
		}
		
	}

}
