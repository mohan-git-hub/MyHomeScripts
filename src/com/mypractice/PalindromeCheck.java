package com.mypractice;

public class PalindromeCheck {
	
	public static boolean IsPalindrome(String InputStr) {
	 for (int i=0,j=InputStr.length()-1;i<=j;i++,j--) {
		 if(InputStr.charAt(i)!=InputStr.charAt(j)) {
			 return false;
		 }
	 }
		return true;
	}
	
	public static void main(String[] args) {
		String InputStr = ""
				+ "GGHGGAB";
		
		if(IsPalindrome(InputStr)==true){
			System.out.println("Given String is a Palindrome");
		}
		else
		{
			System.out.println("Given String is not a Palindrome");
		}
		
	}

}
