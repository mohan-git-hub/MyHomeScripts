package com.home.oops;

public class InstanceSecond {

	String NewBaseURI;
	InstanceFirst IF = new InstanceFirst();
	static int i = 10;
	public void getSecondInstance() {
		IF.assignBaseURI();
	}
	
	public void printNewBaseURI() {
		NewBaseURI = IF.BaseURI;
		System.out.println("New Base URI is " + NewBaseURI);
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		InstanceSecond IS = new InstanceSecond();
		IS.getSecondInstance();
		IS.printNewBaseURI();
	}
	
}
