package chapterSeven;//package chapterSeven;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ExampleOfArraysInJava {
//    public static void main(String[] args) {
//
//        int[] numbers = new int[10];
//        System.out.println(Arrays.toString(numbers));
//        numbers [0] = 9;
//        numbers [1] = 8;
//        numbers [9] = 100;
//        numbers [4] = 29;
//
//        System.out.println(Arrays.toString(numbers));
//        System.out.println();
//        System.out.println(numbers[1] + " "+numbers[4]+" "+numbers[9]);
//    }
//
//}


import java.util.Scanner;

public class ExampleOfArraysInJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many score you wan add?");
        int numberOfScores = scanner.nextInt();
        int[] scores = new int[numberOfScores];
        int sum = 0;

        for (int index = 0; index < numberOfScores; index++) {
            System.out.println("Enter Score" + (index + 1));
            //scores[index] = scores;
            scores[index] = scanner.nextInt();
            sum+=scores[index];
        }

        //for (int index = 0; index < scores.length; index++) {
          //  sum += scores[index];
        //}
        System.out.println("The sum of scores is "+sum);
    }
}



