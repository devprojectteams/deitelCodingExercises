package chapterFive;//Java program to print diamond star pattern
//import java.io.*;

public class PrintingChristmasStarsWithSentinelLoop {

    public static void main(String[] args) {
        int number = 7;

        int m;
        int n;

        for (m = 1; m <= number; m++) {

            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");

            }

            for (n = 1; n <= m * 2; n++) {
                System.out.print("*");
            }

            System.out.println();


            for (n = 1; n <= number - m; n++) {

                for (n = 1; n <= number - m; n++) {
                    System.out.print(" ");

                }

                for (n = 1; n <= m * 2 - 1; n++) {
                    System.out.print("*");


                }
            }
        }
    }
}








