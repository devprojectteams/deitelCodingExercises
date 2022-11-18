package ChapterTwo.Test.Assignment;

import java.util.Scanner;

public class airplaneAcceleration {

    public static void main(String[] args){

        Scanner accel = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");

        double speed = accel.nextDouble();
        double acceleration = accel.nextDouble();

        double length = (speed * speed) / (2 * acceleration);

        System.out.printf("The minimum runway length for this airplane is %.2f\n", length);

    }

}
