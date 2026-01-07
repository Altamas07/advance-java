package com.java8;

import java.util.Arrays;
import java.util.List;

public class FindingMaxAndMin {

	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(1,3,2,44,564,64,75,4,333);
		
		int max=list.stream().max(Integer::compare).get();
		System.out.println("maximum value___ "+max);
		
		int min=list.stream().min(Integer::compare).get();
		
		System.out.println("Minimum value____"+min);
	}
}
