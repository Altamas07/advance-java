package com.java8;

import java.util.function.Predicate;

public class PredicateMethods {

	public static void main(String[] args) {
		
		Predicate<Integer> pe=t -> t%2==0;
		Predicate<Integer> p=t -> t>10;
		
		int a=22;
		
		System.out.println("Single condition of even");
		System.out.println(pe.test(a));
		
		System.out.println("Single condition of greater ");
		System.out.println(p.test(a));
		
		
		System.out.println("combination of both with --and method ");
		System.out.println(p.and(pe).test(a));
		
		System.out.println("combination of both with --or method");
		System.out.println(p.or(pe).test(a));
		
		System.out.println("Logical not ");
		System.out.println(p.negate().test(a));
	}
}
