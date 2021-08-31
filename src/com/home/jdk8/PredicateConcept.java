package com.home.jdk8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateConcept {
	
	public static void main(String[] args) {
		Predicate<Integer> func = x-> x > 30;
		
		List<Integer> InputList = Arrays.asList(23,45,11,75,56,34);
		
		Stream<Integer> StreamList = InputList.stream();
		List<Integer> ResultList = InputList.stream().filter(func).collect(Collectors.toList());
		System.out.println(ResultList);
		System.out.println(StreamList.toString());
		
		List<Integer> AnList = InputList.stream().filter(x-> x>30 && x < 60).collect(Collectors.toList());
		System.out.println(AnList);
		
		Predicate<String> namesfilter = x-> x.startsWith("Kar");
		List<String> StrInputList = Arrays.asList("Karthi", "Karthika", "Karven", "Kavin", "Kavya");
		List<String> NewList = StrInputList.stream().filter(namesfilter.negate()).collect(Collectors.toList());
		System.out.println(NewList);
	}
	

}
