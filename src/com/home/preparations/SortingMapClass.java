package com.home.preparations;

import java.util.*;

public class SortingMapClass {

	public LinkedHashMap<String,Integer> sortHashMap(LinkedHashMap<String,Integer> InputMap){
		
		List<Map.Entry<String,Integer>> ListEntry = new LinkedList<Map.Entry<String,Integer>>(InputMap.entrySet());
		Collections.sort(ListEntry, new Comparator<Map.Entry<String, Integer>>(){
			public int compare(Map.Entry<String, Integer> S1, Map.Entry<String, Integer> S2) {
				return (S1.getValue()).compareTo(S2.getValue());
				
			}
		});
		LinkedHashMap<String,Integer> ResultMap = new LinkedHashMap<String,Integer>();
		
		for(Map.Entry<String, Integer> ss:ListEntry) {
			ResultMap.put(ss.getKey(), ss.getValue());
		}
		
		return ResultMap;
	}
	
	public static void main(String[] args) {
		SortingMapClass SC = new SortingMapClass();
		LinkedHashMap<String,Integer> InputMap = new LinkedHashMap<String,Integer>();
		
		InputMap.put("Java", 500);
		InputMap.put("Python", 400);
		InputMap.put("NodeJS", 250);
		InputMap.put("Javascript", 1200);
		InputMap.put("C++", 120);
		
		System.out.println(SC.sortHashMap(InputMap));
	}
}
