package com.aako;

//User-defined exception class
class AgeNotValidException extends Exception {
 AgeNotValidException(String message) {
     super(message); // Call the constructor of Exception
 }
}

public class Practical13 {
 // Method to validate age
 static void validateAge(int age) throws AgeNotValidException {
     if (age < 18) {
         throw new AgeNotValidException("Age must be 18 or above.");
     } else {
         System.out.println("Age is valid. You are eligible.");
     }
 }

 public static void main(String[] args) {
     try {
         int userAge = 16; 
         System.out.println("Checking age: " + userAge);
         validateAge(userAge);
     } catch (AgeNotValidException e) {
         System.out.println("Exception caught: " + e.getMessage());
     }
 }
}

