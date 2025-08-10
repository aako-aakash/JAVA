package com.aako;

//Parent class
class Person_ {
 String name = "Aakash";

 void display() {
     System.out.println("Name from Person class: " + name);
 }
}

//Child class
class Student_ extends Person_ {
 String name = "Student Aakash";

 void display() {
     System.out.println("Name from Student class: " + name);

     // Using super to access parent class variable
     System.out.println("Name using super: " + super.name);

     // Calling parent class method
     super.display();
 }
}

//Class with final method
class College {
 final void showRules() {
     System.out.println("College rules cannot be changed.");
 }
}


public class Practical11 {
 public static void main(String[] args) {
     Student_ s = new Student_();
     s.display();

     College c = new College();
     c.showRules();
 }
}
