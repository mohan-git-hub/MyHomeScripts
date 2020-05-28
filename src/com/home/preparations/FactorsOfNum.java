package com.home.preparations;

import java.util.Scanner;

public class FactorsOfNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		System.out.print("Factors of the number are ");
		for(int i = 1 ; i <= number ; i++) {
			if(number % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
