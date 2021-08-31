package com.home.preparations;

import java.util.*;

public class AgeComparator implements Comparator {
	
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		
		if(e1.Age==e2.Age) {
			return 0;
		}
		else if(e1.Age>e2.Age) {
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
