package tdd.chapter3Test;

import java.util.Scanner;

public class DistanceExercise {

    public  static void main(String[] args) {
        //collect coordinates from user
        //check perpendicularity of line that cuts across points

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your coordinates");

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println(x1+ " " +x2 +" " +y1 +" " +y2 +" ");
        System.out.println(isPerpendicular( x1, x2, y1,  y2));
    }

    public static boolean isPerpendicular(int x1, int x2, int y1, int y2) {

        boolean isLineWithSamePointsOnEitherAxis = x1 == x2 || y1 == y2;
        boolean isLineWithSlope = (x1 == x2 && y1 == y2);
        boolean lineIsPerpendicular = isLineWithSamePointsOnEitherAxis && !isLineWithSlope;
        return  lineIsPerpendicular;
//        if (isLineWithSamePointsOnEitherAxis && !isLineWithSlope) return true;
       // return false;
    }

    public static boolean forStrings(String coordinates) {
        String[] coords = coordinates.split("");
            for (int i=0; i< coords.length;) {
                if (coords[i++].equals(coords[i + 1])) return true;
            }
            return false;
            }

    }

//        if((x1 == x2 || y1 == y2) && !(x1 == x2 && y1 == y2)) return true;
//
//        return false;


//        if (x1 == x2 || y1 == y2) return false;
//
//        else if (x1 == x2 || y1 == y2) {
//            return true;
//        }
//        return false;




