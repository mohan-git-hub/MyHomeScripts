package com.home.preparations;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Year");
		
		int year = input.nextInt();
		
		if(year % 100 == 0) {
			if(year % 400 == 0) {
				System.out.println("Entered year is a Leap Year");
			}
			else
			{
				System.out.println("Entered year is not a Leap Year");
			}
		}
		else
		{
			if(year % 4 == 0) {
				System.out.println("Entered year is a Leap Year");
			}
			else
			{
				System.out.println("Entered year is not a Leap Year");
			}
		}
	}
}
