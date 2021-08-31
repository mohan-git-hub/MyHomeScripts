package com.mypractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class CompareTxtFiles {
	
	public static void main(String[] args) {
		try {
		BufferedReader BF1 = new BufferedReader(new FileReader("G:\\Mohan\\Selenium_Software\\WorkSpace\\MyHome\\FirstDoc.txt"));
		BufferedReader BF2 = new BufferedReader(new FileReader("G:\\Mohan\\Selenium_Software\\WorkSpace\\MyHome\\SecondDoc.txt"));
		
		List<String> L1 = new ArrayList<String>();
		List<String> L2 = new ArrayList<String>();
		
		String InputText;
		while((InputText = BF1.readLine())!=null) {
			L1.add(InputText);
		}
		while((InputText = BF2.readLine())!= null) {
			L2.add(InputText);
		}
		
		List<String> TempList = new ArrayList<String>(L1);
		
		TempList.removeAll(L2);
		
		System.out.println("Contents in First Text which is not in Second Text File");
		
		for(int i = 0 ; i<=TempList.size()-1;i++) {
			System.out.println(TempList.get(i));
		}
		
		System.out.println("Contents in Second Text which is not in First Text File");
		TempList = L2;
		TempList.removeAll(L1);
		for(int i=0;i<=TempList.size()-1;i++) {
			System.out.println(TempList.get(i));
		}
		
		}
		catch(Exception e) {
			
		}
	}

}
