package com.home.preparations;

import java.util.Scanner;

public class SumNaturalNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Upper Limit Number");
		
		int value = scan.nextInt();
		
		int sum = 0;
		int sum1 = 0;
				
			for(int x = 1; x<=value; x++) {
				sum += x;
			}
		System.out.println("Sum of Natural Numbers within the upper limit is " + sum);
		
		int x=1;
		while(x<=value) {
			sum1 += x;
			x++;
		}
		System.out.println("Sum of Natural Numbers while upper limit is " + sum1);
	}

}
