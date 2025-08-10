package com.aako;

//Abstract class
abstract class Shape {
 // Abstract method (no body)
 abstract void area();

 // Concrete method
 void display() {
     System.out.println("This is a shape.");
 }
}

//Subclass for Circle
class Circle extends Shape {
 double radius;

 Circle(double r) {
     radius = r;
 }

 // Implementing abstract method
 void area() {
     double result = Math.PI * radius * radius;
     System.out.println("Area of Circle: " + result);
 }
}

//Subclass for Rectangle
class Rectangle extends Shape {
 int length, breadth;

 Rectangle(int l, int b) {
     length = l;
     breadth = b;
 }

 void area() {
     int result = length * breadth;
     System.out.println("Area of Rectangle: " + result);
 }
}

public class Practical10 {
 public static void main(String[] args) {
     Shape s;

     s = new Circle(27.0);
     s.display();
     s.area();

     System.out.println();

     s = new Rectangle(7, 4);
     s.display();
     s.area();
 }
}

