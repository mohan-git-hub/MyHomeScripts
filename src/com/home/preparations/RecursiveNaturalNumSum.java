package com.home.preparations;

import java.util.Scanner;

public class RecursiveNaturalNumSum {
	
	public static int RecursiveSum(int num) {
		if(num != 0) {
			return num + RecursiveSum(num-1);
		}
		else
		{
			return num;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = input.nextInt();
		System.out.println(RecursiveSum(num));
	}
	
}
