package com.home.preparations;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter the Number ");
		int number  = input.nextInt();
		
		if(number % 2 ==0) {
			System.out.println("Given number is Even");
		}
		else {
			System.out.println("Given number is Odd");
		}
	}
	
}
