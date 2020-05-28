package com.home.preparations;

import java.util.Scanner;

public class FindQuotAndRemind {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Dividend and Divisor");
		int Dividend = input.nextInt();
		int Divisor = input.nextInt();
		
		int quotient = Dividend/Divisor;
		int Remainder = Dividend%Divisor;
		
		System.out.println("The Quotient for the given number is " + quotient);
		System.out.println("The Remainder for the given number is " + Remainder);
		
	}
	
	
	
}
