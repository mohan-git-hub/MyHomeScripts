package com.home.preparations;

import java.util.Scanner;

public class NumberReversal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int InputNo = scan.nextInt();
/*		String InputStr = scan.next();
		String ReversStr="";
		for(int n=InputStr.length()-1;n>=0;n--) {
			ReversStr += InputStr.charAt(n);
		}
		System.out.println(ReversStr);
*/		
		int revnum = 0;
		while(InputNo!=0) {
			int n = InputNo % 10;
			revnum = revnum * 10 + n;
			InputNo = InputNo/10; 
		}
		System.out.println(revnum);
	}
}
