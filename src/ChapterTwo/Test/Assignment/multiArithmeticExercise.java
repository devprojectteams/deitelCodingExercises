package ChapterTwo.Test.Assignment;

import java.util.Scanner;
 
public class multiArithmeticExercise {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
 
  System.out.print("Input 1st number: ");
  int number1 = in.nextInt();
 
  System.out.print("Input 2nd number: ");
  int number2 = in.nextInt();
 
 
  System.out.println("Addition of two numbers: " + number1 + " + " + number2 + " = " +
  (number1+ number2));
 
  System.out.println("subtraction of two numbers: " + number1 + " - " + number2 + " = " +
  (number1 - number2));
 
  System.out.println("Multiplication of two numbers: "+ number1 + " x " + number2 + " = " +
  (number1 * number2));
 
  System.out.println("Division of two numbers: " + number1 + " / " + number2 + " = " +
  (number1 / number2));
 
  System.out.println("Remainder of two numbers: "+ number1 + " mod " + number2 + " = " +
  (number1 % number2));
 }
 
}

