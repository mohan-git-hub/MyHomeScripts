package com.home.jdk8;

import java.util.Arrays;
import java.util.stream.Stream;

public class SteamWithStringArrFlatMap {
	
	public static void main(String[] args) {
		String[][] StrData = new String[][] {{"You","Me"},{"We","They"},{"He","She"}};
		
		Stream<String[]> FirstStream = Arrays.stream(StrData);
		
		//Apply Flat Map over Stream
		
		Stream<String> FlatResult = FirstStream.flatMap(x->Arrays.stream(x));
		
		Stream<String> DataResultStream = FlatResult.filter(x->x.toString().equals("You"));
		DataResultStream.forEach(System.out::println);
		
		//DirectStream
		
		Stream<String> DataSingle = Arrays.stream(StrData)
									.flatMap(x->Arrays.stream(x))
									.filter(x->x.toString()
									.equals("They"));
		DataSingle.forEach(x->System.out.println(x));
	}

}
