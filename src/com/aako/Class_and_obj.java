//#Q.2) Create  a program to demonstrate how to create and use object in Java.


package com.aako;

class Animal{
	void walk() {
		System.out.println("Animals can walk!");
		
	}
	
	void eat() {
		System.out.println("Animal can eat!");
	}
}


public class Class_and_obj {
	public static void main(String[] args) {
		Animal cat=new Animal();
		cat.walk();
		cat.eat();
	}
}
