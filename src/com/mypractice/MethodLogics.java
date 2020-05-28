package com.mypractice;

public class MethodLogics {
	int a1;
	int a2;
	int start;
	int end;
	
	MethodLogics(){
		
	}
	
	public void loopNumbers(int maxnum) {
		for(int a=1;a<=maxnum;a++) {
			if(a % 2 == 0) {
				System.out.println(a + " is an even number");
			}
			else
			{
				System.out.println(a + " is an odd number");
			}
		}
	}
	
	public static void MultiLoop(int num1, int num2) {
		MethodLogics MT = new MethodLogics();
		for(MT.start = 0; MT.start<=num1 ; MT.start++ ) {
			for (MT.end = 0; MT.end<=num2 ; MT.end++) {
				System.out.println("The Value of Start is " + MT.start + " and the value of End is " + MT.end);
			}
		}
	}
	
	public void loopswhile(int a, int b) {
		
		while (a < 10) {
			System.out.println("The Value of a is " + a);
		a++;	
		}
		do{
			System.out.println("The Value of b is " + b);
			 b++;
		}
			 while (b>11);
	}
	
	public static void swithtest(int num) {
		
		switch(num) {
		case 1:
			System.out.println("The color is Violet");
		break;

		case 2:
			System.out.println("The color is Indigo");
		break;

		case 3:
			System.out.println("The color is Blue");
		break;

		case 4:
			System.out.println("The color is Violet");
		break;

		}
		
	}
	
	
	public static void main(String[] args) {
		MethodLogics MT = new MethodLogics();
		//MT.loopNumbers(100);
		//MultiLoop(5,10);
		//MT.loopswhile(5,10);
		swithtest(3);
	}
}
