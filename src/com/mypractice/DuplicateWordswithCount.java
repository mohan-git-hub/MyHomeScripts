package com.mypractice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordswithCount {

	public static void main(String[] args) {
	

		String InputStr = "Yellow Brown Orange White Yellow White Orange Blue Orange";
		HashMap<String,Integer> TextMap = new HashMap<String,Integer>(); 
		
		for(String text:InputStr.split(" ")) {
			Integer count = TextMap.get(text);
			
			if(count == null) {
				TextMap.put(text, 1);
			}
			else
			{
				TextMap.put(text, count+1);
			}
		}
		Set<Entry<String,Integer>> KeySet = TextMap.entrySet();

		for(Entry<String,Integer> KeyEntry :KeySet) {
			if(KeyEntry.getValue() > 1) {
				System.out.println(KeyEntry.getKey() + " present for " + KeyEntry.getValue() + " No. of Times");
			}
		}
	}
	
}
