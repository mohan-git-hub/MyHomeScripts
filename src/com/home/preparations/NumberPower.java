package com.home.preparations;

public class NumberPower {

	public static void main(String[] args) {
		int number = 20;
		int exponent = 0;
		
		long result =1;
		while(exponent > 0) {
			result *= number;//
			exponent--;
		}
		System.out.println(result);
		System.out.println(Math.pow(20, 2));
	}
}
