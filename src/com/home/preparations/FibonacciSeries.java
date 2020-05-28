package com.home.preparations;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int upperlimit = 20;
		int FirstNum = 0;
		int SecondNum = 1;
		int Result;
		for (int x = 0;x<=upperlimit;x++) {
			System.out.print(FirstNum + " ");
			Result = FirstNum + SecondNum;
			FirstNum = SecondNum;
			SecondNum = Result;
		}
		
		
		
	}
}
