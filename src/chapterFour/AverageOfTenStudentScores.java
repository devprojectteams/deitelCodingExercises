package chapterFour;

import java.util.Scanner;

public class AverageOfTenStudentScores {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int sum = 0;
        int counter;
        String superscript = "st";


        for (counter = 1; counter < 11; counter++) {

            switch (counter) {

                case 1 -> superscript = "st";

                case 2 -> superscript = "nd";

                case 3 -> superscript = "rd";

                default -> superscript = "th";

            }
            System.out.println("Please enter " + counter + superscript + " grade");
            int grade = userInput.nextInt();
//            System.out.println("Please enter " + counter + superscript + "grade");
//            grade = userInput.nextInt();

//            if (grade < 0 || grade > 100) System.exit(1);

            if (isValidGradeScore(grade)) sum = sum + grade;
            if (grade < 0 || grade >= 100) terminateAbruptly();
//            sum = sum + grade;

        }
        int average = sum / counter;

        System.out.println("The average of the Students grade is: " + average);

    }

    private static boolean isValidGradeScore(int grade) {
        return grade >= 0 && grade <= 100;
    }

    private static void terminateAbruptly(){
       System.out.println("you entered an out of range grade");
      System.exit(1);
   }
}

