package com.home.oops;

public class Outer {
	
	public static void ProcessOuter() {
		System.out.println("Executing Outer Class");
	}
	
	class Inner {
		public void ProcessInner() {
			System.out.println("Executing Inner Class");
		}
	}

	public static void main(String[] args) {
		Outer out = new Outer() {
			public void processmain() {
				System.out.println("Executing anonymous inner class");
			}
		};
		Inner in = out.new Inner();
		ProcessOuter();
		new Outer().new Inner().ProcessInner();

		
		
	}
}
