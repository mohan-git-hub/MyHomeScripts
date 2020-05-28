package com.mypractice;

public class DurgaSoftTest {
	
	public static void Addnum(int [] totalsum) {
		System.out.println("The length of totalsum  " + totalsum.length);
		int AN=0;
		for(int i=0;i<=totalsum.length-1;i++) {
			AN += totalsum[i];
		}
		System.out.print(" "+ AN);
	}
	public  int Smallnum(int [] fsn) {
		System.out.println("The length of Smallnum  " + fsn.length);
		int BigValue;
		BigValue = fsn[0];
		int SmallValue = fsn[0];
		for(int i=1;i<fsn.length;i++) {
			if(fsn[i]>BigValue) {
				BigValue = fsn[i];
			}if(fsn[i]<SmallValue) {
				SmallValue=fsn[i];
			}
		}
		System.out.println("The Big Value in the Array is "  + BigValue);
		System.out.println("The Small Value in the Array is "  + SmallValue);
		
		return BigValue + SmallValue;
	}
	public static void main(String [] args) {
		
	int[] Numbers = {2,13,6,11,5,8,10,15,14};
	Addnum(Numbers);
	new DurgaSoftTest().Smallnum(Numbers);
	
	
	}
	

}
