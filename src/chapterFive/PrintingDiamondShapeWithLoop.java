//package chapterFive;
//
//public class PrintingDiamondShapeWithLoop {
//
//    public static void main(String[] args) {
//            int blank = 4;
//            for (int topTriangleRow  = 1;topTriangleRow < 10; topTriangleRow+= 2) {
//                for (int space = 0; space < blank; space ++) {
//                    System.out.print(" ");
//                }
//
//                for (int asterisk = 1;asterisk <= topTriangleRow; asterisk++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//                blank--;
//            }
//
//            blank = 1;
//            for (int bottomTriangleRow = 7; bottomTriangleRow > 0; bottomTriangleRow -= 2) {
//                for (int space = 0; space < blank; space++) {
//                    System.out.print(" ");
//                }
//                for (int asterisk = bottomTriangleRow; asterisk > 0; asterisk--) {
//                    System.out.print("*");
//                }
//                System.out.println();
//                blank++;
//            }
//
package chapterFive;

import java.util.Scanner;

public class PrintingDiamondShapeWithLoop {

    public static void main(String[] args) {
            int blank = 0;

        System.out.println("please enter a positive number");
        Scanner userInput = new Scanner(System.in);
        blank = userInput.nextInt();

        for (int topTriangleRow  = 1;topTriangleRow < 10; topTriangleRow+= 2) {
               for (int space = 0; space < blank; space ++) {
                    System.out.print(" ");
                }

                for (int asterisk = 1;asterisk <= topTriangleRow; asterisk++) {
                    System.out.print("*");
                }
                System.out.println();
                blank--;
            }

            blank = 1;
            for (int bottomTriangleRow = 7; bottomTriangleRow > 0; bottomTriangleRow -= 2) {
                for (int space = 0; space < blank; space++) {
                    System.out.print(" ");
                }
                for (int asterisk = bottomTriangleRow; asterisk > 0; asterisk--) {
                    System.out.print("*");
                }
                System.out.println();
                blank++;
            }
        }
  }












































































//
//package chapterFive;
//
//public class PrintingDiamondShapeWithLoop {
//
//    public static void main(String[] args) {
//
//        int number = 7;
//
//        int m, n;
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