package ChapterTwo.Test.Assignment;

import java.util.Scanner;

public class allFourNumber {
 public static void main(String[] args) {
		 
 Scanner input = new Scanner(System.in);
 System.out.print("Input first number: ");
  
 int firstNumber1 = input.nextInt();
 
System.out.print("Input second number: ");
         
int secondNumber2 = input.nextInt();
		 
System.out.print("Input third number: ");
         
int thirdNumber3 = input.nextInt();
         
System.out.print("Input fourth number: ");
         
int fourthNumber4 = input.nextInt();
		
		
  if (firstNumber1 == secondNumber2 && secondNumber2 == thirdNumber3 && thirdNumber3 == fourthNumber4) 
		  {
			System.out.println("Numbers are equal.");
                               
    }
		else
			{
			
 System.out.println("Numbers are not equal!");
		
	}
	
 }

}