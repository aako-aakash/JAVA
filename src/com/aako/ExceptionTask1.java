package com.aako;
import java.util.Scanner;

public class ExceptionTask1 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2=sc.nextInt();
		
		try {
			System.out.println("Division of "+num1+"and"+num2+"is: "+(num1/num2));
			
		}catch(Exception e) {
			System.out.println("Division can't be done!");
			
		}
	}
	
}
