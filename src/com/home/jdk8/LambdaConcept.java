package com.home.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaConcept {

	public static void main(String[] args) {
		List<String> InputList = Arrays.asList("Kumar", "Raj", "Ram", "Madhan", "Vimal");
		InputList.forEach(str->System.out.println(str));
		
		for(int i=0;i<InputList.size();i++) {
			System.out.println(InputList.get(i));
		}
		
		for(String str:InputList) {
			System.out.println(str);
		}
		
		InputList.forEach(new Consumer<String>(){
			public void accept(String t) {
				System.out.println("Consumer Names " + t);
			}
		});
		InputList.forEach(System.out::println);
		
	}
	
}
