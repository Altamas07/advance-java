package com.java8;


import java.util.Arrays;
import java.util.List;

public class RemovingDuplicates {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(12,32,32,42,12,42,45);
		
		list.stream().distinct().forEach(System.out::println);
		
		
	}
}
