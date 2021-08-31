package com.home.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterFindAnyORElse {

	public static void main(String[] args) {
		
		List<Employee> EmpList = Arrays.asList(new Employee("Vinay",20000),
												new Employee("Kumar",25000),
												new Employee("Rahul",21000),
												new Employee("Saranya",35000),
												new Employee("Vikram",24000));
		Employee emp = EmpList.stream()
				.filter((x)->x.getSalary()>22000 && x.getName().equals("Vikram"))
				.findAny()
				.orElse(null);
		
		System.out.println(emp.getName());
		
		String EmpName = EmpList.stream()
		.filter(x->"Saranya".equals(x.getName()))
		.map(Employee::getName).findAny().orElse(null);
		
		System.out.println(EmpName);
		
		System.out.println("----------------------");
		List<String> ResultSet = EmpList.stream().map(Employee::getName).collect(Collectors.toList());
		ResultSet.forEach(System.out::println);
	}
}