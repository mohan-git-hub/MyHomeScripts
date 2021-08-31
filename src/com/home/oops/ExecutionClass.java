package com.home.oops;

import com.home.oops.DoubleClass.innerClass;



public class ExecutionClass {

	public static void main(String[] args) {
		DoubleClass DC = new DoubleClass()
		{
		public void Display() {
			System.out.println("Printing Display method of Anonymous Class");
		}		
		};
		DC.Display();
		
		innerClass ic = DC.new innerClass();
		ic.display();
		
		
	}
}
