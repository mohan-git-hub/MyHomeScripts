package com.home.preparations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintLongestString {
	
	@SuppressWarnings("null")
	public static void main(String args[]) {
		String InputStr = "ababcabcdabcdeabcdef";
		List<String> Result = new ArrayList<String>();
		for(int i=0,j=i+1;i<InputStr.length()-1;i++,j++) {
			char First = InputStr.charAt(i);
//			System.out.println("ASCII Value of a First Char is " + (int)First);
					char Second = InputStr.charAt(j);
//					System.out.println("ASCII Value of a Second Char is " + (int)Second);
					if((int)Second - (int)First == 1) {
						Result.add(String.valueOf(First));
					}
					else
					{
						Result.clear();
					}
		}
		System.out.println(Result);
	}
}
