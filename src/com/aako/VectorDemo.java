package com.aako;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();

        // Adding elements
        names.add("Aakash");
        names.add("Darshan");
        names.add("Anurag");

        // Display elements
        System.out.println("Vector elements: " + names);

        // Insert at specific index
        names.add(1, "Aako");
        System.out.println("After insertion: " + names);

        // Remove an element
        names.remove("Anurag");
        System.out.println("After removal: " + names);

        // Size of vector
        System.out.println("Size of vector: " + names.size());

        // Access element by index
        System.out.println("Element at index 1: " + names.get(1));
    }
}

