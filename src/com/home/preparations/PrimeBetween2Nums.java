package com.home.preparations;

import java.util.Scanner;

public class PrimeBetween2Nums {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Two Numbers");
		int BeginNum = input.nextInt();
		int LastNum = input.nextInt();
		
		while(BeginNum <= LastNum) {
			boolean flag = false;
			
			for(int i=2;i<=BeginNum/2;i++) {
				if(BeginNum % i ==0) {
					flag = true;
				}
			}
			
			
			if(flag) {
				System.out.println(BeginNum + " is not a Prime Number");
			}
			else {
				System.out.println(BeginNum + " is a Prime Number");		
			}
			BeginNum++;
		}
		
		
/*		for(int i=BeginNum;i<=LastNum;i++) {
			boolean flag = false;
			for(int j=2;j<i;j++) {
				if(i % j == 0) {
					flag = true;
					break;
				}
			}
			if(flag) {
				System.out.println(i + " is a not a Prime Number");
			}
			else
			{
				System.out.println(i + " is a Prime Number");
			}
		} */
	}
}