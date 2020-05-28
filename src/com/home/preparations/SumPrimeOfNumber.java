package com.home.preparations;

import java.util.Scanner;

public class SumPrimeOfNumber {
	
	public boolean IsPrime(int number) {
		
		boolean flag = true;
		
		for(int i = 2; i<number; i++) {
			if(number % i == 0) {
				flag = false;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		SumPrimeOfNumber smp = new SumPrimeOfNumber();
		boolean flag = true;
		for(int i = 2;i<=number/2;i++) {
			if(smp.IsPrime(i)) {
				if(smp.IsPrime(number-i)) {
					System.out.println(i + " + " + (number-i) + " = "+  number);
				}
			}
		}
		if(!flag) {
			System.out.println("The Number should not be the sum of two prime numbers");
		}
	}
}
