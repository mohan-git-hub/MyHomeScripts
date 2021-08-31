package com.home.preparations;


import java.util.*;
import java.io.*;


public class SimpleSortMain {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Employee("Raj","Chennai",32));
		al.add(new Employee("Kumar","Chennai",25));
		al.add(new Employee("Evelyn","Chennai",33));
		al.add(new Employee("Saurabh","Chennai",28));
		al.add(new Employee("Murugan","Chennai",30));
		
		System.out.println("Sorting By Name");
		
		Collections.sort(al,new NameComparator());
		Iterator it1 = al.iterator();
		while(it1.hasNext()) {
			Employee e1 = (Employee)it1.next();
			System.out.println(e1.Name + " "+ e1.City + " " +e1.Age);
		}
		System.out.println("Sorting By Age");
		
		Collections.sort(al, new AgeComparator());
		Iterator it2 = al.iterator();
		while(it2.hasNext()) {
			Employee e2 = (Employee)it2.next();
			System.out.println(e2.Name + " "+ e2.City + " " + e2.Age);
		}
	}
}
