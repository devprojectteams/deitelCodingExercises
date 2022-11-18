package ChapterTwo.Test.Assignment;

import java.util.Scanner;
 
public class allOperatorsAndRemainder {
 
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
   
  System.out.print("Input first number: ");
  int number1 = input.nextInt();
   
  System.out.print("Input second number: ");
  int number2 = input.nextInt();
   
 
  System.out.println(number1 + " + " + number2 + " = " +
  (number1 + number2));
   
  System.out.println(number1 + " - " + number2 + " = " +
  (number1 - number2));
   
  System.out.println(number1 + " x " + number2 + " = " +
  (number1 * number2));
   
  System.out.println(number1 + " / " + number2 + " = " +
  (number1 / number2));
 
  System.out.println(number1 + " mod " + number2 + " = " +
  (number1 % number2));
 }
}