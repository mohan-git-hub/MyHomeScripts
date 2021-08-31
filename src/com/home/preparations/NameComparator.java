package com.home.preparations;

import java.util.*;

public class NameComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		
		return e1.Name.compareTo(e2.Name);
	}
	
}
