package com.home.jdk8;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreamClass {
	
	public static void main(String[] args) {
		//1.
		Stream simpless = Stream.of("Vikram","Kumar","Ram","Rahul","Bai");
		//simpless.forEach(System.out::println);
		
		//2.
		simpless.findAny().ifPresent(x->System.out.println(x));
		
		//3.
		Arrays.asList("one","Two","Three","Four").
		stream().
		findFirst().
		ifPresent(System.out::println);
		
		IntStream.range(0,10).forEach(System.out::println);
		
		//4.
		Arrays.stream(new int[] {2,4,5,8})
		.map(x->(x*2 + 1))
		.average().ifPresent(System.out::println);
		
		//5. String Objects
		
		Stream.of("l1","l7","l3","l6","l5")
		.map(a -> a.substring(1))
		.mapToInt(Integer::parseInt)
		.max()
		.ifPresent(System.out::println);
		
		//5. String Array Objects
		Stream.of("Long","Short","Tall","Dwarf","High","Low")
		.map(s -> s.substring(1))
		.filter(x->x.endsWith("f"))
		.forEach(System.out::println);
		;
		
		//6/ Double Array
		Stream.of(1.0,2.0,3.0)
		.mapToInt(Double::intValue)
		.mapToObj(a -> "a" + a)
		.forEach(x->System.out.println(x));
		
		//7. Limit Function
		
		Stream.iterate(0, n -> n+1)
		.limit(10)
		.forEach(System.out::println);
		
		//8. Odd Numbers in Stream
		
		Stream.iterate(0, n -> n+1).filter(x -> (x%2 != 0))
		.limit(10)
		.forEach(System.out::println);
	}
	

}
