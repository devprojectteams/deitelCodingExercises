package ChapterTwo.Test.Assignment;

import java.util.Scanner;

public class Velocity {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		System.out.print("startingVelocity_v0 " + "  (pls enter only Decimal numbers) ");
		double startingVelocity_v0 = input.nextDouble();

		System.out.print("endingVelocity_v1" + "  (pls enter only Decimal number(s)) ");
		double endingVelocity_v1  = input.nextDouble();

		System.out.print(" Enter the time:" + "  (pls enter only Decimal number(s)) ");
		double time = input.nextDouble();


		double averageAcceleration = (endingVelocity_v1 - startingVelocity_v0) / time;


		System.out.println("The average acceleration is " + averageAcceleration);
	}
}