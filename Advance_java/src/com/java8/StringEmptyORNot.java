package com.java8;

import java.util.function.Predicate;

public class StringEmptyORNot {

	public static void main(String[] args) {
		
		Predicate<String> p=t ->t.isEmpty();
		
		String s="";
		
		System.out.println(p.test(s));
	}
}
