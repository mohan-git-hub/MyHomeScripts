package com.home.preparations;

import java.util.Scanner;

public class CheckPrimeOrNot {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = input.nextInt();
		int flag=0;
		for(int i=num-1;i>1;i--) {
			if(num % i == 0) {
				flag = 1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Given number is not a Prime");	
		}
		else
		{
			System.out.println("Given number is Prime");
		}
	}
}
