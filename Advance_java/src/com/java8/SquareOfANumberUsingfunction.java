package com.java8;

import java.util.function.Function;

public class SquareOfANumberUsingfunction {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f=t ->t*t;
		
		int a=30;
		
		System.out.println(f.apply(a));
	}
}
