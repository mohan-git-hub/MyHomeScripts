package com.mypractice;

//Static
//Instant 

//Variables:
	//1. Variables declared in Static Area can be accessed through Class
	//2. Variables declared in Instant Area can be accessed through Object
//Methods
	//1. Methods declared in Static Area can be accessed through Class
	//2. Methods declared in Instant Area can be accessed through Object

//Constructors - Call Only through Object
//Instant Blocks - Call Only through Object
//Static Blocks - Call through Class


public class MyHomeClass {

	String s1 = "New Car";
	static String s2 = "Yellow";
	
	public static String StringConcat1() {
		String s3;
		s3=new MyHomeClass().s1;
		return s3;
	}
	
	public String StringConcat2() {
		String s4;
		s4=s2;
		return s4;
	}

public static void main(String[] args) {
	//StringConcat1();
	//new MyHomeClass().StringConcat2();
	System.out.println("I have a "+ StringConcat1() +"."+"Which is of colour" + " "+new MyHomeClass().StringConcat2());
	
}
}
