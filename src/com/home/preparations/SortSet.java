package com.home.preparations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortSet {
	
	public static void main(String[] args) {
		Set<Integer> NumSet = new HashSet();
		NumSet.add(25);
		NumSet.add(22);
		NumSet.add(29);
		NumSet.add(21);
		NumSet.add(27);
		TreeSet<Integer> TSet = new TreeSet<Integer>(NumSet);
		System.out.println(TSet);
		ArrayList<Integer> list = new ArrayList<Integer>(NumSet);
		Collections.sort(list);
		System.out.println(list);
		
	}
}
