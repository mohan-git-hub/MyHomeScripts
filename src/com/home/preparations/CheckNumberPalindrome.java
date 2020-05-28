package com.home.preparations;

import java.util.Scanner;

public class CheckNumberPalindrome {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		int n1 = number;
		int revnum = 0;
		while(number!=0) {
			int ModNum = number % 10;
			revnum = revnum * 10 + ModNum;
			number = number/10;
		}
		System.out.println(revnum);

			if(n1 == revnum) {
				System.out.println("Given number is a Palindrome");
			}
			else
			{
				System.out.println("Given number is not a Palindrome");
			}
		}
	}


