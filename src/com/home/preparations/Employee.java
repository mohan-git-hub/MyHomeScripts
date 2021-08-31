package com.home.preparations;

import java.util.*;

public class Employee {
	
	String Name, City;
	int Age;
	
	public Employee(String Name, String City, int Age) {
		this.Name = Name;
		this.City = City;
		this.Age = Age;
	}
	
	public String toString() {
		return this.Name + " " + this.City + " " + this.Age;
	}
	
	
}
