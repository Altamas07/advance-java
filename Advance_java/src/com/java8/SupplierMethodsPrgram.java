package com.java8;

import java.util.function.Supplier;

public class SupplierMethodsPrgram {

	public static void main(String[] args) {
		
		Supplier<String> s=() -> "Hello Java 8";
		System.out.println(s.get());
		
	}
}
