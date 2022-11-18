package ChapterTwo.Test.Assignment;

import java.util.Scanner;

public class acceptTwoCompare {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Input the first number : ");
    int firstNumber = in.nextInt();

    System.out.print("Input the second number: ");
    int secondNumber = in.nextInt();
    System.out.println("Result: "+result(firstNumber, secondNumber));
}
    public static int result(int firstNumber, int secondNumber)
    {
        if(firstNumber == secondNumber)
            return 0;
        if(firstNumber % 6 == secondNumber % 6)
            return Math.min(firstNumber, secondNumber);
        return Math.max(firstNumber, secondNumber);
    }
}
