package com.home.preparations;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number to print its Multiplication Table");
		int number = input.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(i + " x " + number +" = " + i*number);
		}
		
	}
	
}
