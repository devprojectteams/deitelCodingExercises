package chapterFour;

import java.util.Scanner;

public class LargerAndSmaller {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);




        System.out.println("enter a number ");
        int userNumberInput = userInput.nextInt();

        int largestNumber = userNumberInput;
        int smallestNumber = userNumberInput;

        while (userNumberInput != 0){
            int counter = 0;
            if (userNumberInput > largestNumber){
                largestNumber = userNumberInput;
            }
            if (userNumberInput < smallestNumber){
                smallestNumber = userNumberInput;
            }
            System.out.println("Enter a number, Enter 0 to quit!: ");
           userNumberInput = userInput.nextInt();

            counter = +1;


        }

        System.out.println("enter a Number");
        //int userNumberInput = userInput.nextInt();

        System.out.printf("Smallest and Largest numbers are: %d, %d,", smallestNumber, largestNumber );

    }
}
