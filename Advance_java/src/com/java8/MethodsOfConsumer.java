
package com.java8;

import java.util.function.Consumer;

public class MethodsOfConsumer {

	public static void main(String[] args) {
		
		
		Consumer<String> c=t -> System.out.println("Hello"+t);
		c.accept("Java ");
		c.accept("World");
		
		Consumer<String> c1=t -> System.out.println("Bye"+t);
		
		c.andThen(c1).accept("HII");
		

		
	}
}
