package com.home.jdk8;

import java.util.*;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorConcept {

	public static void main(String[] args) {
		UnaryOperator<Integer> Unfunc = x -> x * 2;
		int Value = Unfunc.apply(20);
		System.out.println(Value);
		
		Function<String,Integer> Func = x -> x.length();
		System.out.println(Func.apply("Heya this is the String"));
		
		List<String> InputList = new ArrayList<String>();
		InputList.add("Mohan");
		InputList.add("Raj");
		InputList.add("Vinoth");
		InputList.add("Vimal");
		
		InputList.replaceAll(text->text + " Kumar");
		System.out.println(InputList);
	}
	
}
