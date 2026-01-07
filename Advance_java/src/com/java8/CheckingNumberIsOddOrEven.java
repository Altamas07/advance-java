package com.java8;

import java.util.function.Predicate;

public class CheckingNumberIsOddOrEven {

	public static void main(String[] args) {
		
		Predicate<Integer> p= t -> t%2==0;
		
		int[] num= {11,13,45,22,65,78};
		
		for(Integer n:num) {
			
		
		if(p.test(n)) {
			
			System.out.println(n+"  "+"even number");
			
		}
		else {
			
			System.out.println(n+"  "+"odd number");
		}
		}
	}
}
