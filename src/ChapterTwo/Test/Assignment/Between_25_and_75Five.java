package ChapterTwo.Test.Assignment;

import java.util.*;
 public class Between_25_and_75Five {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int firstNumber = in.nextInt();  
		System.out.print("Input the secondNumber: ");
		int secondNumber = in.nextInt(); 
		System.out.println("Result: "+common_digit(firstNumber,secondNumber));
    }
	public static boolean common_digit(int p, int q)
     {  
	   if (p<25 || q>75)
		   return false;
	   int firstNumber = p % 10;
	   int secondNumber = q % 10;
	   p /= 10;
	   q /= 10;
	   return (p == q || p == secondNumber || firstNumber == q || firstNumber == secondNumber);
     }
	
}