package com.home.oops;

public class LambaClass implements Linterface{

	public static void main(String[] args) {
	Linterface LC = new Linterface() {
		public void print() {
			System.out.println("Printing the Anonymous method");
		}
	};
	LC.print();
	
	Linterface LC1 = ()->System.out.println("Printing the Lambda method");
	LC1.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
