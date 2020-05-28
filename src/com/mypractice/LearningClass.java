package com.mypractice;

public class LearningClass {

	
	int phi;
	int R1;
	
	public void CalcRad(int radius)
	{
		int R1=radius*radius;
		System.out.println("The value of radius is " + R1);
		this.R1=R1;
	}
	
	public int Calchei(int height) {
		System.out.println("The value of height is " + height);
		return height;
	}
	
	public static double Calcarea(int a, int radius, int height) {
		LearningClass LC = new LearningClass();
		LC.phi = a;
		System.out.println("The value of phi is " + LC.phi);
		LC.CalcRad(radius);
		double Area = (0.5) * LC.phi * LC.R1 * LC.Calchei(height);
		System.out.println("The value of Area is " + Area);
		return Area;
		
	}
		
		public static void main(String[] args) {
			System.out.println("The area of Cone " + LearningClass.Calcarea(3,5,10));
	}
	
}
