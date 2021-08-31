package com.home.preparations;

public class ArmstrongNumber {
	
	public static void isArmstrongNumber(int num) {
		int resultnum=0;
		int originalnum = num;
		while(num > 0) {
			int lastnum = num % 10;
			resultnum += lastnum * lastnum * lastnum;
			System.out.println("Last Number is " + lastnum);
			num = num /10;
		}
		System.out.println("Result Number is " + resultnum);
		if(originalnum==resultnum) {
			System.out.println("Given number is an Armstrong Number");
		}
		else {
			System.out.println("Given number is not an Armstrong Number");			
		}
		
	}
	
	public static void main(String args[]) {
		isArmstrongNumber(370);
	}

}
