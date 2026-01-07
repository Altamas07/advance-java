package com.java8;

import java.util.Arrays;
import java.util.List;

public class LargestElement {

	public static void main(String[] args) {
		
	List<Integer> list=Arrays.asList(1,2,3,4,5,6,77,8);
	
	list.stream().filter(n->n>5)
	.forEach(System.out::println);
	
	}
}
