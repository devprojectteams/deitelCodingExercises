package chapterFive;

import java.util.Scanner;

public class PythagoreanTriples {
    public static void main(String[] args) {
        int side1 = 1;
        int side2 = 1;
        int side3 = 1;


//        System.out.println("Enter two numbers to find the pythagorean Triples  ");
//        System.out.println("Enter number  to check for the first side of a pythagorean Triples  ");
//        Scanner userInput = new Scanner(System.in);
//        number1 = userInput.nextInt();


        for (int counter1 = side1; counter1  <= 500; counter1 ++) {
            for (int counter2 = side2; counter2 <= 500; counter2 ++) {
                for (int counter3 = side3; counter3 <= 500; counter3++) {
                    if ((counter3*counter3) == (counter1 * counter1) + (counter2 * counter2) ) {

                        System.out.printf("%d %d %d%n", counter1, counter2, counter3);
                        System.out.printf("%d + %d = %d%n", counter1*counter1, counter2*counter2, counter3*counter3);

                    }

                }

            }

        }

    }
}
