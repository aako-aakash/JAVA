package com.aako;

import java.util.Scanner;

public class Practical12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        try {
            System.out.print("Enter first number: ");
            a = sc.nextInt();

            System.out.print("Enter second number: ");
            b = sc.nextInt();

            int result = a / b;  // May throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        } finally {
            System.out.println("Program ended (finally block executed).");
        }
    }
}
