package com.mypractice;

import java.util.Arrays;

public class StringArrayTest {
	String full ="I have a brand new red color Audi car";
	
	public void processstrarray(String full) {
	String[] wordarray = full.split(" ");
	//);	
	System.out.println(wordarray.length);
	for (int i=0;i<=wordarray.length-1;i++) {
		Arrays.sort(wordarray);
		System.out.println(wordarray[i]+" ");
	}}

	public static void main(String[] args) {
		StringArrayTest STR = new StringArrayTest();
		STR.processstrarray(STR.full);
		
		
	}
	

}
