package com.aako;

//Thread class to print numbers
class NumberThread extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Number: " + i);
         try {
             Thread.sleep(500);  // Delay of 0.5 seconds
         } catch (InterruptedException e) {
             System.out.println("NumberThread interrupted");
         }
     }
 }
}

//Thread class to print characters
class CharThread extends Thread {
 public void run() {
     for (char c = 'A'; c <= 'E'; c++) {
         System.out.println("Character: " + c);
         try {
             Thread.sleep(500);  // Delay of 0.5 seconds
         } catch (InterruptedException e) {
             System.out.println("CharThread interrupted");
         }
     }
 }
}

public class Practical14 {
 public static void main(String[] args) {
     NumberThread nt = new NumberThread();
     CharThread ct = new CharThread();

     nt.start();  // Start number thread
     ct.start();  // Start character thread
 }
}

