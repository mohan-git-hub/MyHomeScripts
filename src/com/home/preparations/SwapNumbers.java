package com.home.preparations;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 70;
		int b = 50;
		
/*		System.out.println("Before Swapping");
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("After Swapping");
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a);		
		System.out.println("b = " + b);
*/
		
		System.out.println("Before Swapping");
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("After Swapping");
		
		a = a+b; 
		b = a-b; 
		a = a-b; 
		
		System.out.println("a = " + a);		
		System.out.println("b = " + b);
		
	}
}
