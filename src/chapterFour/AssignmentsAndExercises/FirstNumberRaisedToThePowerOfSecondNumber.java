package chapterFour.AssignmentsAndExercises;

import java.util.Scanner;

public class FirstNumberRaisedToThePowerOfSecondNumber {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("enter first number");
        int firstNumber = userInput.nextInt();


        System.out.println("enter second number");
        int secondNumber = userInput.nextInt();

        if (secondNumber < 0) specialNegativeExponentialCase(firstNumber, secondNumber);
        else {
            int result = 1;
            for (int i = 0; i < secondNumber; i++) {
                result *= firstNumber;
            }
            System.out.println(result);
        }

    }

    private static void specialNegativeExponentialCase(int firstNumber, int secondNumber) {

        int result = 1;
//        secondNumber *= -1;
        for (int i =secondNumber; i < 0; i++) {
            result *= firstNumber;
        }

        System.out.println(1 +"/" + result);

//        double res = 1 / (double) result;
//        System.out.println(res);
    }

}