package ChapterTwo.Test.Assignment;

import java.util.Scanner;
public class Feet_Converter {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number in feet :");
    double feetValue = input.nextDouble();



    double meter = feetValue * 0.305;

    // as 1 feet = 0.305 m.
    System.out.println(feetValue + " feet is " + meter + " meter");
  }
}
