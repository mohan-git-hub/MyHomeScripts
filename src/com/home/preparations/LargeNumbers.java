package com.home.preparations;

import java.util.Scanner;

public class LargeNumbers {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(a > b && a > c) {
			System.out.println("A is Greater");
		}
		else if(b > c) {
			System.out.println("B is Greater");
		}
		else
		{
			System.out.println("C is Greater");
		}
		
		if(a>=b) {
			if(a>=c) {
				System.out.println("A is Greater");
			}
			else
			{
				System.out.println("C is Greater");
			}
		}
		else {
			if(b>=c) {
				System.out.println("B is Greater");
			}
			else
			{
				System.out.println("C is Greater");
			}
		}
	}
}
