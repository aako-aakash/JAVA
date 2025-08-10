package com.aako;

class Student {
    String name;
    int roll;
    void setDetails(String n, int r) {
        name = n;
        roll = r;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}
public class Practical3 {
    public static void main(String[] args) {
        Student s1 = new Student();  

        s1.setDetails("Aakash", 03);
        s1.displayDetails();          
    }
}
