package com.aako;

class Person {
    String name;
    int age;

    // Constructor Overloading
    Person() {
        name = "Unknown";
        age = 0;
    }

    Person(String n) {
        name = n;
        age = 21;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Method Overloading
    void display() {
        System.out.println("Name: " + name);
    }

    void display(String msg) {
        System.out.println(msg + " " + name + ", Age: " + age);
    }
}

public class Practical4 {
    public static void main(String[] args) {
        // Constructor Overloading
        Person p1 = new Person();
        Person p2 = new Person("Aakash");
        Person p3 = new Person("AAKO", 20);

        // Method Overloading
        p1.display();
        p2.display("Welcome");
        p3.display("Hello");
    }
}

