package com.mypractice;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class DomainNames {

	public static void main(String[] args) {
		
	try {	
	PrintStream o = new PrintStream(new FileOutputStream("G:\\Saranya\\Official\\Words.txt"));
	
		for (char c1='a';c1<='z';c1++) {
			for(char c2='a';c2<='z';c2++) {
				for(char c3='a';c3<='z';c3++) {
					for(char c4='a';c4<='z';c4++) {
						for(char c5='a';c5<='z';c5++) {
							System.setOut(o);
							System.out.println(c1+""+c2+""+c3+""+c4+""+c5);
							
							
						}
						
					}
						
					
					
				}
						
			}
		}
	}
	catch(Exception e) {
		
	}
	}
	
}
