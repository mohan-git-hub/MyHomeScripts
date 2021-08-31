package com.home.jdk8;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntArrWithFlatMap {

	public static void main(String[] args) {
		int[] data = {3,5,4,6,2,8,9};
		Stream<int[]> StrIntArr = Stream.of(data);
		
		IntStream intstr = StrIntArr.flatMapToInt(x->Arrays.stream(x));
		
		intstr.forEach(System.out::println);
	}
	
	

}
