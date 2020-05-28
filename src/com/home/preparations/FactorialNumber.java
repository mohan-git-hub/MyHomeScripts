package com.home.preparations;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int factorial = 1;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		int Number = input.nextInt();
		
		for(int x = 1; x<=Number ; x++) {
			factorial = factorial * x;
		}
		System.out.println("Factorial of a Number is " + factorial);
	}
}
