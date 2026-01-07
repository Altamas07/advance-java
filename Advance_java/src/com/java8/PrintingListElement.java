package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrintingListElement {

	public static void main(String[] args) {
		
		List<Integer> ls=Arrays.asList(12,34,2,121,32,3);
		
		Consumer<Integer> c=s-> System.out.println(s);
		
		ls.forEach(c);
		
	}
}
