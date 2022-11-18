package chapterFour;

import java.util.Scanner;

public class CompareLargestAndSmallest {
    public static void main(String[] args) {

        System.out.println("Please Enter as many Number as possible");
        System.out.println("Please Enter Number \"0\" to end your Inputs");

        Scanner userInput = new Scanner(System.in);


        int largestNumber = 0;
        int smallestNumber = 0;
        int counter = 0;
        System.out.println("enter a number ");
        int userNumberInput = userInput.nextInt();

        while(userNumberInput != 0) {


            if (userNumberInput > largestNumber)

                largestNumber = userNumberInput;

            if (userNumberInput < smallestNumber)

                smallestNumber = userNumberInput;

            System.out.println( "enter another number or press 0 to quit ");
             userNumberInput = userInput.nextInt();


               counter = +1;

            }
            System.out.println("The smallest integer is: " + smallestNumber);
            System.out.println("The smallest integer is: " + largestNumber);

        }
    }

