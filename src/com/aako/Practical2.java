package com.aako;

import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

       
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

     
        System.out.print("Enter your marks: ");
        float marks = sc.nextFloat();

        
        System.out.println("\n--- Your Details ---");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
    }
}
