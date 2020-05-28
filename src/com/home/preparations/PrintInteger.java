package com.home.preparations;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the Number");
		
		int number = input.nextInt();
		System.out.println("The Input number is " + number);
	}
	
}
