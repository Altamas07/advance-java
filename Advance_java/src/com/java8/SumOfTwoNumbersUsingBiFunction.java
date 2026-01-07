package com.java8;

import java.util.function.BiFunction;

public class SumOfTwoNumbersUsingBiFunction {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> bf= (k,f)-> f+k;
		
		int a=34;
		int c=45;
		
		System.out.println(bf.apply(a, c));
	}
}
