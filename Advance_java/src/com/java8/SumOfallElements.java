package com.java8;

import java.util.Arrays;
import java.util.List;

public class SumOfallElements {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(12,34,242,432);
		
	
		int sum=list.stream().mapToInt(Integer :: intValue).sum();
		
		System.out.println(sum);
	}
}
