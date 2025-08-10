package com.aako;

//Single Inheritance Example
class Animal {
 void sound() {
     System.out.println("Animal makes a sound");
 }
}

class Dog extends Animal {
 void bark() {
     System.out.println("Dog barks");
 }
}

//Multilevel Inheritance Example
class Puppy extends Dog {
 void weep() {
     System.out.println("Puppy weeps");
 }
}

//Hierarchical Inheritance Example
class Cat extends Animal {
 void meow() {
     System.out.println("Cat meows");
 }
}

public class Practical8 {
 public static void main(String[] args) {
     System.out.println("== Single Inheritance ==");
     Dog d = new Dog();
     d.sound();
     d.bark();

     System.out.println("\n== Multilevel Inheritance ==");
     Puppy p = new Puppy();
     p.sound();
     p.bark();
     p.weep();

     System.out.println("\n== Hierarchical Inheritance ==");
     Cat c = new Cat();
     c.sound();
     c.meow();
 }
}
