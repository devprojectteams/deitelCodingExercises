package chapterFour;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter a number");
        int number = userInput.nextInt();
        for (int i= 0;i<=10;i++)
            System.out.printf("%d times %d is %d\n", i, i, number*i);
    }




       //for (int counter =20; counter>=1; counter -- ){
            //System.out.printf("%d times %d is %d\n", number, counter, number*counter);
       }

            //System.out.printf("%d times %d is %d\n", number, counter-4, (number*(counter-4)));
