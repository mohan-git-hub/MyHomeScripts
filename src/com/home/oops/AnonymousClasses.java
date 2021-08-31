package com.home.oops;

public class AnonymousClasses {
	
	static class innerClass {
		public void display() {
			System.out.println("Display the inner methods");
		}
	}
	
	public static void main(String[] args) {
		try {
		innerClass in = innerClass.class.newInstance();
		in.display();
		}
		catch(Exception e) {
			
		}
		AnonymousClasses AC = new AnonymousClasses() {
			public void displayanonymous() {
				System.out.println("Display Anonymous Methods");
			}
		};
		
		}

}
