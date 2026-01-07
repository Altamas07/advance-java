package com.java8;

public class RunnableLambdaExpression {

	public static void main(String[] args) {
		
		Runnable run=() -> System.out.println("Hello jva 8") ;
		
		new Thread(run).start();
	}
}
