package com.home.preparations;

import java.util.Scanner;

public class FactorialRecursive {

	public static int RecursiveMultiple(int num) {
		if(num >= 1) {
			return num * RecursiveMultiple(num-1);
		}
		else
		{
			return 1;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = input.nextInt();
		System.out.println("Factorial of a Number is " + RecursiveMultiple(num));
	}
	
}
