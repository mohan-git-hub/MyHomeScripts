package com.home.preparations;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {
	
	public void DuplicateUsingArray(String[] texts) {
		System.out.print("Duplicate Elements are ");
		for(int i=0;i<texts.length-1;i++) {
			for(int j=i+1;j<texts.length;j++) {
				if(texts[i].equals(texts[j])) {
					System.out.print(texts[i] + " ");
				}
				
			}
		}
	}
	
	public void DuplicateUsingSet(String[] texts) {
		Set<String> textset = new HashSet<String>();
		System.out.println("");
		System.out.print("Duplicate Elements are ");
		for(String text:texts) {
			if(textset.add(text) == false) {
				System.out.print(text + " ");
			}
		}
	}
	
	public void usingHashMap(String[] texts) {
		Map<String,Integer> textmap = new HashMap<String,Integer>();
		
		for(String text:texts) {
			Integer count = textmap.get(text);
			if(count==null) {
				textmap.put(text, 1);
			}
			else {
				textmap.put(text, ++count);
			}
		}
		Set<Entry<String,Integer>> entryset = textmap.entrySet();
		System.out.println(entryset);
		for(Entry<String,Integer> keyEntry : entryset) {
			if(keyEntry.getValue() > 1) {
				System.out.println("Duplicate Elements are " + keyEntry.getKey());
			}
		}
	}
	
	public static void main(String[] args) {
		
		DuplicateElements dp = new DuplicateElements();
		String[] inputtexts = {"black", "blue", "green", "orange", "white", "blue", "green"};
		dp.DuplicateUsingArray(inputtexts);
		dp.DuplicateUsingSet(inputtexts);
		dp.usingHashMap(inputtexts);
	}

}
