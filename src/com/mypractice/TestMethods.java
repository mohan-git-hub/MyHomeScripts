package com.mypractice;

public class TestMethods {
	
	int Area;
	
	public int CalcArea(int radius) {
		Area = 3 * radius * radius;
		return Area;
	}

	public int CalcArea() {
		Area = 20;
		return Area;
	}
	
	public double CalcArea(int radius, int height) {
		double Area = (0.5) * radius * height;
		return Area;
	}
	
	public int CalcArea(int length, int breadth, int width) {
		Area = length * breadth * width;
		return Area;
	}

	
	public static void main(String[] args) {
		TestMethods TE = new TestMethods(); 
		System.out.println("The Value of Area is " + TE.CalcArea(5,10,15));
	}

}
