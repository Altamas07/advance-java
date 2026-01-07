package com.java8;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class RandomNumberGenerateUsingSupplier {

	public static void main(String[] args) {
		
		Random random=new Random();
		
		Supplier<Integer> s=() -> random.nextInt(100);;
             
		Stream.generate(s).limit(5).forEach(System.out::println);
		
		
		
	}
}
