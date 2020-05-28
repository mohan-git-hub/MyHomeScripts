package com.mypractice;

public class RevComTest {
	static char A='B';
	static char E='F';
	static char B='A';
	static char F='E';
	public static String RevCostr(String Inputstr) {
		String full="";
		System.out.println(Inputstr.length());
		for(int i=Inputstr.length()-1; i>=0; i--)
		{
			if(Inputstr.charAt(i)=='A') {
				full+=A;
			}
			else if(Inputstr.charAt(i)=='B') {
				full+=B;
			}
			else if(Inputstr.charAt(i)=='E') {
				full+=E;
			}
			else if(Inputstr.charAt(i)=='F') {
				full+=F;
			}
		}
		return full;
		}
	
	public static void main(String[] args)
	{
		String Inputstr ="AEBF";
		System.out.println("The Reverse String " +RevCostr(Inputstr));
		//System.out.println("The Complement of the String ");
				
	}
}
