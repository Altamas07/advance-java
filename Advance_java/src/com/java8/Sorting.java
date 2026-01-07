package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(12,32,43,21,433,2,1);
		
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("Descending order");
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
