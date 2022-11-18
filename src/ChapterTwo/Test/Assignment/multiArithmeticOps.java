package ChapterTwo.Test.Assignment;

import java.util.Scanner;
 
public class multiArithmeticOps {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input firstNumber" );
  int number1 = in.nextInt();
   
  System.out.print("Input secondNumber" );
  int number2 = in.nextInt();
   
 
  System.out.println("Addition of two numbers: "+ number1 +"  +  "+ number2 +" = " +
  (number1 + number2));



  System.out.println("subtraction of two numbers: " + number1 + " - " + number2 + " = " +
          (number1 - number2));


   System.out.println("multiplication of two numbers: " + number1 + " * " + number2 + " = " +
          (number1 - number2));


  System.out.println("Division of two numbers: " + number1 + " / " + number2 + " = " +
          (number1 / number2));

  System.out.println("Remainder of two numbers: "+ number1 + " mod " + number2 + " = " +
          (number1 % number2));
 }
 
}