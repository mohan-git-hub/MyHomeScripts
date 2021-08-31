package com.mypractice;

import java.util.*;

public class SortArrayList {

	public static void main(String[] args) {
	List<Integer> IntList = Arrays.asList(5,8,3,1,9,4);
	List<String> StrList = Arrays.asList("L5","L3","L1","L4","L2");
	String[] InputStr = {"L5","L3","L1","L4","L2"};
	Arrays.sort(InputStr);
	Collections.sort(IntList);
	Collections.sort(StrList);
	System.out.println(IntList);
	System.out.println(StrList);
	for(int i = 0 ; i<InputStr.length;i++) {
		System.out.println(InputStr[i]);
	}
	
	
	
	}
}
