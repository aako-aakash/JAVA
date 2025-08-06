package com.aako;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
		    // Code that may throw an exception
		    int result = 10 / 0;
		} catch (ArithmeticException e) {
		    // Handling the exception
		    System.out.println("Cannot divide by zero!");
		} finally {
		    System.out.println("This block always executes.");
		}


	}

}
