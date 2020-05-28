package com.home.preparations;

import java.util.Scanner;

public class CalculatorFunction {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int FirstNum = input.nextInt();
		int SecondNum = input.nextInt();
		
		System.out.println("Enter the Operator to Calculate +, -, /, *");
		
		char operator = input.next().charAt(0);
		
		double result = 0;
		switch(operator) {
		
		case '+':
			result = FirstNum + SecondNum;
		break;

		case '-':
			result = FirstNum - SecondNum;
		break;
		
		case '*':
			result = FirstNum * SecondNum;
		break;

		case '/':
			result = FirstNum / SecondNum;
		break;
		
		default:
			System.out.println("Please enter the Correct Operator");
		break;

		}
		
		System.out.println("The Result is " + result);
		
	}

}
