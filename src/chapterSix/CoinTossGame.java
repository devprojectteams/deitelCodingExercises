//package chapterSix;
//
//import java.security.SecureRandom;
//import java.util.Scanner;
//
//public class CoinTossGame {
//
//    private static CoinTossGame game = new CoinTossGame();
//
//    public static void main(String[] args) throws InterruptedException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(CoinTossGame.getGameMenu());
//        int usersInput = scanner.nextInt();
//        System.out.println(usersInput);
//        do {
//            switch (usersInput){
//                case 1->game.flip();
//                case 2->goodbye();
//            }
//            System.out.println(CoinTossGame.getGameMenu());
//            usersInput = scanner.nextInt();
//        }while(usersInput>0&&usersInput<3);
//
//    }
//
//    private static void goodbye() throws InterruptedException {
//        displayResult();
//        System.out.print("Shutting Down");
//        for (int counter = 0; counter < 5; counter++) {
//            TimeUnit.SECONDS.sleep(1);
//            System.out.print(".");
//        }
//    }
//
//    private static void displayResult(){
//        game.displayGameResult();
//    }
//
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
////package chapterSix;
////
////
////import java.security.SecureRandom;
////
////public class CoinTossGame {
////    public static String getGameMenu() {
////        return """
////                1. Toss Coin
////                2. Exist Game
////                """;
////    }
////
////    public String flip() {
////        int randomNumber = generateRandomNumberBetweenZeroAndOne();
////
////        if (randomNumber == 0){
////            headsCount ++;
////                return coin.HEADS.name();
////        }
////        int tailscount;
////        tailscount++;
////
////        return coin.TAILS.name();
////    }
////
////    public int getHeadsCounts(){
////        int headsCount;
////        return headsCount;
////    }
////
////    private static int generateRandomNumberBetweenZeroAndOne() {
////        SecureRandom secureRandom = new SecureRandom();
////
////        return secureRandom.nextInt(2);
////    }
////    public void displayGameResult(){
////
////    }
////
////    public int getHeadCount() {
////        return ;
////    }
////
////    public int getTailsCount() {
////    }
////}
