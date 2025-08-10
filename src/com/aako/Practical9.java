package com.aako;

//First interface
interface Printable {
 void print();
}

//Second interface
interface Showable {
 void show();
}

//A class implementing both interfaces
class Demo implements Printable, Showable {
 public void print() {
     System.out.println("Printing from Printable interface");
 }

 public void show() {
     System.out.println("Showing from Showable interface");
 }
}

public class Practical9 {
 public static void main(String[] args) {
     Demo d = new Demo();
     d.print();
     d.show();
 }
}
