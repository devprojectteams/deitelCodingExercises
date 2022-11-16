package chapterThree.ExercisesInClass;

import java.util.Scanner;

public class odd_Or_Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.print("pls enter a number");
        int number = input.nextInt();


        if ( number % 2 == 0) {
        System.out.printf("%s number is Even", number);
        }
       else {
           System.out.println(number + " is not even");
       }
    }
}