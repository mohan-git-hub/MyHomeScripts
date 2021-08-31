package com.home.jdk8;

import java.util.function.Function;

public class FunctionalInterfanceConcept {

	public static void main(String[] args) {
	Function<String,Integer> functions = a->a.length();
	int length = functions.apply("This is the input text");
	System.out.println(length);
	
	//ChainingFunction
	Function<Integer,Integer> functions2 = x->x*2;
	int value = functions.andThen(functions2).apply("This is the input text");
	System.out.println(value);
	}
}
