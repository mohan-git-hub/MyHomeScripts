package com.home.preparations;

import java.util.Scanner;

public class CheckArmsStrongNumber {

	public void checkArmsStrongNumber(int number) {

		int actualnumber = number;
		int sum=0;
		
		while(number > 0) {
			int processnum = number % 10 ;
			sum += processnum*processnum*processnum;
			number = number/10;
		}
		if(sum == actualnumber) {
			System.out.println("Given number is a Armstrong Number");
		}
		else
		{
			System.out.println("Given number is not a Armstrong Number");
		}

	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = input.nextInt();
		int actualnumber = number;
		int sum=0;
		
		while(number > 0) {
			int processnum = number % 10 ;
			//sum += processnum*processnum*processnum;
			sum += Math.pow(processnum, 3);
			number = number/10;
		}
		System.out.println(sum);
		if(sum == actualnumber) {
			System.out.println("Given number is a Armstrong Number");
		}
		else
		{
			System.out.println("Given number is not a Armstrong Number");
		}
		new CheckArmsStrongNumber().checkArmsStrongNumber(number);
	}
	
}
