package com.mypractice;

public class checkPalindrome {
	
	public boolean isPalindrome(String s) {
		
		int l = s.length();
		for(int i=0, j = l-1;i<=j;i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		checkPalindrome cp = new checkPalindrome();
		
		String s = "ADBCBDAFR";
		int mincount = 0;
		int flag = 0;
		
		while(s.length()>0) {
			if(cp.isPalindrome(s)) {
				flag = 1;
				break;
			}
			else {
				mincount++;
				s  = s.substring(0, s.length()-1);
			}
		}
		System.out.println("Minimum number of changes to become a palindrome " + mincount);
		}
}
