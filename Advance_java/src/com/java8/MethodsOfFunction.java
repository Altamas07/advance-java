package com.java8;

import java.util.function.Function;

public class MethodsOfFunction {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f=t -> t*t*t;
		Function<Integer, Integer> f1=t -> t*2;
		
		System.out.println("Abstract method of function");
		System.out.println(f.apply(3));
		
		
		System.out.println("Default method of Function ");
		System.out.println(f.andThen(f1).apply(5)); // in this method first come first execute 
		
		System.out.println("Second default method of function");
		System.out.println(f.compose(f1).apply(5)); // last come serve first 
		
		
		System.out.println("Identity ");
		
		
	}
} 
