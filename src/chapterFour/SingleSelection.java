package chapterFour;

import java.util.Scanner;


public class SingleSelection {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = inputCollector.nextInt();
        if(userInput < 0) {
            System.out.println("Out of range");
        }

        else if (userInput % 2 == 0) System.out.println("It is even");

        else System.out.println("This is odd biko");
        }
    }



