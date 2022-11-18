package chapterFour;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter a number");
        int number = userInput.nextInt();
        int numberOfLoopExecutions = 0;
        StringBuffer buffer = new StringBuffer();

        for (int counter = number - 1; counter <= 1; counter--) {
            // for (int counter =number-1; counter>=1; counter --){
            System.out.println("number-->" + number);
            System.out.println("counter-->" + counter);
            System.out.println(number + "*" + counter);
            buffer.append(counter + 1);
            number = number * counter;
            System.out.println(number);
            numberOfLoopExecutions++;
        }
        buffer.append(1);
        System.out.println(buffer);
        System.out.println("factorial is" + number);
        System.out.println("loop executed "+numberOfLoopExecutions+"times");
    }
}
