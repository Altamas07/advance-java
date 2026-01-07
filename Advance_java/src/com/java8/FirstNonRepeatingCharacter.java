package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(12,32,3,344,54,3,5);
		
		list.stream().filter(t -> Collections.frequency(list, t)==1)
		.findFirst()
		.ifPresent(System.out::println);
		
	}
}
