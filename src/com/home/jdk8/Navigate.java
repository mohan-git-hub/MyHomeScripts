package com.home.jdk8;

@FunctionalInterface
public interface Navigate {
	
	public void Page();
	public static void GotoPage() {
		System.out.println("Executing Static Method in Functional Interface");
	}	
	default void NavigatetoPage() {
		System.out.println("Executing Default Method in Functional Interface");
	}
}