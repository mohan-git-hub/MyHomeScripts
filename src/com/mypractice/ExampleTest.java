package com.mypractice;

public class ExampleTest {
	String Color;
	String Type;
	
	public void Cardesign(String Color,String Type)
	{
		this.Color= Color;
		this.Type= Type;
		
	}
	
	public int Carspeed(int Dis, int Time) {
		int Speed =(Dis/Time);
		return Speed;
	}
	
	public static void overallcar (String Color, String Type, int Dis, int Time) {
		ExampleTest ET = new ExampleTest();
		ET.Cardesign("Blue", "Petrol");
		System.out.println("The Color of car is " + Color +" and Type is " + Type + "and it is traveling with a speed of " + ET.Carspeed(Dis,Time));
	}
	
	public static void main(String [] args)
	{
		ExampleTest.overallcar("Blue","Petrol",600,10);
	}
}
