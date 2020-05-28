package com.mypractice;

import java.util.ArrayList;

public class ListOfList {

	public void ProcessListofList(int n) {
		ArrayList<ArrayList<Integer>> FirstArr = new ArrayList<ArrayList<Integer>>(n);
		
		ArrayList<Integer> subList = new ArrayList<Integer>();
		subList.add(2);
		subList.add(3);
		subList.add(4);
		FirstArr.add(subList);
		System.out.println(FirstArr.get(0).size());
	}
	
	public static void main(String[] args) {
		ListOfList LOL = new ListOfList();
		LOL.ProcessListofList(3);
		
		
	}
	
}

