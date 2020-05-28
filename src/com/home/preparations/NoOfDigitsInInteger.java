package com.home.preparations;

import java.util.Scanner;

public class NoOfDigitsInInteger {
	
	public static void main(String[] args) {
/*		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		String number = input.next();
		int sum = 0;
		for(int i=1;i<=number.length();i++) {
			sum += 1;
		}
	System.out.println("No of Digits in an integer is " + sum);
*/
		
		long number = 9894150824580l;
		int count = 0;
		while(number !=0) {
			number = number/10;
			count ++;
		}
		System.out.println("Number of digits in an integer is " + count);
	}

}
