package com.home.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSetWithFlatMap {
	
	public static void main(String[] args) {
		
		Managers Manage1 = new Managers();
		Manage1.setName("Vimal");
		Manage1.addDevices("Nokia 8");
		Manage1.addDevices("Samsung Pro");
		Manage1.addDevices("Macbook Pro");
		Manage1.addDevices("Reliance J777");

		Managers Manage2 = new Managers();
		Manage2.setName("Kumar");
		Manage2.addDevices("Redmi Note 8");
		Manage2.addDevices("Sony Erision");
		Manage2.addDevices("Macbook Pro");
		Manage2.addDevices("Reliance J780");

		List<Managers> ManageList = new ArrayList<Managers>();
		ManageList.add(Manage1);
		ManageList.add(Manage2);
		
		List<String> ResultList = ManageList.stream()
		.map(x -> x.getDevices())
		.flatMap(x->x.stream()).distinct()
		.collect(Collectors.toList());
		ResultList.forEach(x->System.out.println(x));
		
	}
}
