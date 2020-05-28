package com.home.preparations;

import java.util.Scanner;

public class CheckPositiveNegative {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the input values");
		
		double value = input.nextDouble();
		
		if(value<0) {
			System.out.println("Given value is Negative");
		}
		else if(value>0)
		{
			System.out.println("Given value is positive");
		}
		else
		{
			System.out.println("Given value is 0");
		}
	}
}
