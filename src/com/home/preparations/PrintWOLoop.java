package com.home.preparations;

public class PrintWOLoop {
		
	public static void countPrint(int number) {
		System.out.println("Mohankumar");
		if(number < 1000) {
			number++;
			countPrint(number);
		}
	}
	
	public static void main(String args[]) {
		countPrint(1);
	}	
}
