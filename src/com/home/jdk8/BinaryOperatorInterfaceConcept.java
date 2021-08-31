package com.home.jdk8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		BinaryOperator<Integer> func1 = (x1,x2) -> x1+x2;
		int result = func1.apply(20, 30);
		System.out.println(result);
		
		BiFunction<Integer,Integer,Integer> BiFunc = (x1,x2) -> x1+x2;
		int BiResult = BiFunc.apply(10, 450);
		System.out.println(BiResult);
		
		BiFunction<String,Integer,Integer> BiTri = (x1,x2) -> x1.length()/x2;
		int BiTriResult = BiTri.apply("How are you", 3);
		System.out.println(BiTriResult);

	}
	
}
