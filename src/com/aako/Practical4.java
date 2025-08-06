package com.aako;

class Calculator1 {

  
  int add(int a, int b) {
      return a + b;
  }


  double add(double a, double b) {
      return a + b;
  }

 
  double add(int a, double b) {
      return a + b;
  }

 
  double add(double a, int b) {
      return a + b;
  }
}

public class Practical4 {
  public static void main(String[] args) {
      Calculator1 calc = new Calculator1();

      System.out.println("Sum of 5 and 10 (int): " + calc.add(5, 10));
      System.out.println("Sum of 5.5 and 6.5 (double): " + calc.add(5.5, 6.5));
      System.out.println("Sum of 5 (int) and 7.5 (double): " + calc.add(5, 7.5));
      System.out.println("Sum of 4.5 (double) and 3 (int): " + calc.add(4.5, 3));
  }
}
