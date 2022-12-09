package chapterFour.AssignmentsAndExercises;

import java.util.Scanner;

public class FootballPlayers {
    public static void main(String[] args) {

        Scanner player = new Scanner(System.in);

        System.out.println("enter a number, to know player and wing played");
       int userInput = player.nextInt();


        switch (userInput) {



            case 1-> System.out.println("Player Number One is The Goalkeeper ");

            case 2 -> System.out.println("Player Number Two is The Right back Defender");

            case 3-> System.out.println("Player Number One is The left back Defender");

            case 4-> System.out.println("Player Number One is The center Defender");

            case 5-> System.out.println("Player Number One is The Defender");

            case 6-> System.out.println("Player Number One is The Midfielder");

            case 7-> System.out.println("Player Number One is The Midfielder");

            case 8-> System.out.println("Player Number Eight is The Midfielder");

            case 9-> System.out.println("Player Number Nine is an Attacker");

            case 10-> System.out.println("Player Number Ten is an Attacker");

            case 11-> System.out.println("Player Number Eleven is an Attacker");

            //case 3--> System.out.println("Player Number One is The Goalkeeper");
            default ->               handleOtherUserInput("player");


//            case 12 -> {
                //System.out.println();
              // String user = player.next();




        }
    }


    private static void handleOtherUserInput(String player) {
        System.out.println("Abeg you no sabi football");

    }
    }