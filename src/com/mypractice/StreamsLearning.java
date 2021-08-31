package com.mypractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamsLearning {
	
	public static void main(String[] args) {
		try {
		InputStreamReader ISR = new InputStreamReader(System.in);
		System.out.println("Enter the Input String");
		System.out.println((char)ISR.read());
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Input String");
		System.out.println(BR.readLine());
		}
		catch(IOException IE) {
			
		}
		
	}
	

}
