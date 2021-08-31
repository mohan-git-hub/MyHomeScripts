package com.home.jdk8;

public class Employee {
	
	private String Name;
	private int Salary;

	Employee(String Name, int Salary){
		this.Name = Name;
		this.Salary = Salary;
	}

//Getter and Setter Methods
	
	public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public int getSalary() {
		return Salary;
	}
	
	public void setSalary(int Salary) {
		this.Salary = Salary;
	}
}
