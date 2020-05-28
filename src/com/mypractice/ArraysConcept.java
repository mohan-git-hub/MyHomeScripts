package com.mypractice;

public class ArraysConcept {
	
	
	String[] strarr = {"blue","green","Yellow"};
	char[] chrarr = {'a','b','c','d'};
	
	public void processarray(int[] numarr){
		
	System.out.println("Length of the Array is " + numarr.length);
	
		for(int i=0; i<numarr.length-1;i++){
			int noofoccurence=1;				
			for (int j=i+1;j<numarr.length;j++) {
				if(numarr[i] == numarr[j]) {
					System.out.println("Repeating elements are " + numarr[i]);
					noofoccurence +=1;
					System.out.println(numarr[i] + " present for " + noofoccurence + " number of times");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ArraysConcept ac = new ArraysConcept();
		int[] InputArr = {3,2,4,5,1,1,4,8,2,1};	
		ac.processarray(InputArr);
	}

}
