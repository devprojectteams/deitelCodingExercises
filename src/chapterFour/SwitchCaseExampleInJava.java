package chapterFour;

import java.util.Scanner;

public class SwitchCaseExampleInJava {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                1. 2000
                2. 5000
                3. 10000
                4. 15000
                5. 20000
                                
                """);

        System.out.println("Enter amount to withdraw: ");

        int input = scanner.nextInt();
            switch (input) {

                case 1:
                    System.out.println("Take your 2k");
                    break;
                case 2:
                    System.out.println("Take your 5k");
                case 3:
                    System.out.println("Take your 10k");
                    break;
                case 4:
                    System.out.println("Take your 15k");
                    break;
                case 5:
                    System.out.println("Take your 20k");
                    break;

                case 6:
                    System.out.println("enter amount");
                    String amount = scanner.next();
                    handleOtherAmounts(amount);
                    break;

                default:
                    System.out.println("money don finish");
            }


        }


    private static void handleOtherAmounts(String amount) {
        System.out.println("please take your "+amount+"k");
    }

}










//        System.out.println("Pick an Option");
//
//        int input = scanner.nextInt();
//        switch (input) {
//
//                case 1:
//                    System.out.println("Take your 2k");
//                    break;
//                case 3:
//                    System.out.println("Take your 5k");
//                case 3:
//                    System.out.println("Take your 10k");
//                    break;
//                default:

//            }
//
//
//        }
//    }
//




//package chapterFour;
//
//        import java.util.Scanner;
//
//public class SwitchCaseExampleInJava {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("""
//                1. 2000
//                2. 5000
//                3. 10000
//                4. 15000
//                5. 20000
//
//                """);
//
//        System.out.println("Enter amount to withdraw: ");
//
//        int input = scanner.nextInt();
//        switch (input) {
//
//
//            case 1--> System.out.println("Take your 2k");
//
//            case 2 --> System.out.println("Take your 5k");
//
//
//            case 3--> System.out.println("Take your 10k");
//
//
//
//            case 6 --> {
//                System.out.println("enter amount");
//
//                String amount = scanner.next();
//                handleOtherAmounts(amount);
//
//
//        }
//    }
//
//    }
//
//    private static void handleOtherAmounts(String amount) {
//        System.out.println("please take your "+amount+"k");
//    }
//
//}