package com.home.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerConcept {

	public static void main(String[] args) {
		Consumer<String> confun = x -> System.out.println(x);
		confun.accept("This is consumer Interface");;
		
		List<String> StrList = Arrays.asList("Muthu", "Mani", "Michael", "Murugan");
		StrList.forEach(a->System.out.println(a));
	}
}
