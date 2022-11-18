package ChapterTwo.Test.Assignment;

import java.util.Scanner;
public class Between_0_and_1000 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int number = input.nextInt();

        int firstDigit = number % 10;
        int remainingNumber = number / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println("The sum of all digits in " + number + " is " + sum);

    }
}