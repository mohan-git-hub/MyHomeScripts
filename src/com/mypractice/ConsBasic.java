package com.mypractice;

//Variables - Local, Instant, Static
//Methods - Static, Instant, Main -- With/out Arguments, Over Loading, Return Type 
//Constructor
//Static Blocks
//Instant Blocks

public class ConsBasic {
	
	int Average;
	int Total;

	public ConsBasic(int a) {
		this("hi");
		System.out.println("One Argument Constructor");
	}
	public ConsBasic() {
		this(20);
		System.out.println("No Argument Constructor");
		
	}
	
	public ConsBasic(String Result) {
		this(20,30);
		System.out.println("String Argument Constructor");
	}

	public ConsBasic(int a, int b) {
		System.out.println("Two Argument Constructor");
	}
	public static void main(String[] args) {
		new ConsBasic();
	}

}
