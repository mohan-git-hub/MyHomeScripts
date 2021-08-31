package com.home.jdk8;

import java.util.function.Supplier;

public class SupplierConcept {

	public static void main(String[] args) {
		ProcessSupplier(()->"Findit");
	} 
	
	public static void ProcessSupplier(Supplier<String> text) {
		System.out.println(text.get().length());
	}
}
