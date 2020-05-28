package com.mypractice;

public class ReverseString {
	
	
	public static String reverseString(String Instr) {
		String revStr="";
		
		for(int i = Instr.length()-1 ; i >=0 ; i--) {
			revStr += Instr.charAt(i); // ABCDEFGH
		}
		return revStr;
	}
	
	public static void main(String[] args) {
		String Instr = "HGFEDCBAASASADADD";
		System.out.println(reverseString(Instr));
		
	}

}
