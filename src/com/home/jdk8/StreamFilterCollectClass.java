package com.home.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollectClass {
	
	public static void main(String[] args) {
		List<String> ProductList = Arrays.asList("Samsung","Apple","OnePlus","Redmi","Adidas");
		ProductList.forEach(Str->System.out.println(Str));
		
		List<String> ResultList = ProductList
					.stream()
					.filter(Str->!Str.equals("Adidas"))
					.collect(Collectors.toList());
		ResultList.forEach(System.out::println);
		ResultList.forEach(ele->System.out.println(ele));
	}

}
