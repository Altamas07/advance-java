package com.java8;

import java.util.function.Consumer;

public class PrintingMessageUsingConsumer {

	public static void main(String[] args) {
		
		Consumer<Integer> c=System.out::println;
		
		c.accept(34);
		
		Consumer<String> s=System.out::println;
		
		s.accept("Consumer dont return any thing it only takes value and print it ");
	}
}
