// #Q.3)

package com.aako;

class Student {

    String name;
    int roll;

    Student(String studentName, int studentRoll) {
        name = studentName;
        roll = studentRoll;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}

public class Constructor3 {
    public static void main(String[] args) {
 
        Student s1 = new Student("Aakash",03);
        Student s2 = new Student("Anurag",05);

        s1.display();
        System.out.println(); 
        s2.display();
    }
}
