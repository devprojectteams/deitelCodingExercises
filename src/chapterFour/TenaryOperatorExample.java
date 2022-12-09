package chapterFour;

import java.util.Scanner;

public class TenaryOperatorExample {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your age,please! ");
       int age = userInput.nextInt();
       String resolve = age == 50 ? "Sugar Daddy Things" : "Sugar boy thinzzz";
        System.out.println(resolve);
    }
}
