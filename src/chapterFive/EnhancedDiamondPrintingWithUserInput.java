package chapterFive;

import java.util.Scanner;

public class EnhancedDiamondPrintingWithUserInput {

    public static void main(String[] args) {

        int number = 0;


        System.out.println("please enter a positive number");
        Scanner userInput = new Scanner(System.in);
         number = userInput.nextInt();



        for (int topTriangleRow = 1;topTriangleRow<= number; topTriangleRow++) {

            for (int space = 1;  space <= number -  topTriangleRow; space++) {
                System.out.print(" ");
            }

            for (int asterisks = 1; asterisks <= topTriangleRow * 2 - 1; asterisks++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int bottomTriangleRow = number - 1; bottomTriangleRow  > 0; bottomTriangleRow --) {


            for (int space = 1; space <= number - bottomTriangleRow ; space++) {
                System.out.print(" ");
            }

            for (int asterisks = 1; asterisks <= bottomTriangleRow * 2 - 1; asterisks++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}









//
//package chapterFive;
//
//        import java.util.Scanner;
//
//public class EnhancedDiamondPrintingWithUserInput {
//
//    public static void main(String[] args) {
//
//        int number = 7;
//
//        int m, n;
//
//
//        for (m = 1; m <= number; m++) {
//
//            for (n = 1; n <= number - m; n++) {
//                System.out.print(" ");
//            }
//
//            for (n = 1; n <= m * 2 - 1; n++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//        for (m = number - 1; m > 0; m--) {
//
//
//            for (n = 1; n <= number - m; n++) {
//                System.out.print(" ");
//            }
//
//            for (n = 1; n <= m * 2 - 1; n++) {
//                System.out.print("*");
//            }
//
//
//            System.out.println();
//        }
//    }
//}
//



