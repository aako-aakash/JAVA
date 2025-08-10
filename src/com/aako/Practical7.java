package com.aako;

public class Practical7 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Aakash");

        // Append text
        sb.append(" Kumar");
        System.out.println("After append: " + sb);

        // Insert text
        sb.insert(0, "Mr. ");
        System.out.println("After insert: " + sb);

        // Replace part of text
        sb.replace(0, 4, "Dr. ");
        System.out.println("After replace: " + sb);

        // Delete part of text
        sb.delete(0, 4);
        System.out.println("After delete: " + sb);

        // Reverse the text
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}

