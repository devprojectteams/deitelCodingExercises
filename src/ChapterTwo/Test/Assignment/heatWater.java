package ChapterTwo.Test.Assignment;

import java.util.Scanner;

public class heatWater {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		System.out.print("Enter the amount of water in kilograms: ");
		double kilograms = input.nextDouble();

		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();

		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();


		double energy = kilograms * (finalTemperature - initialTemperature) * 4184;


		System.out.println("The energy needed is " + energy);
	}
}