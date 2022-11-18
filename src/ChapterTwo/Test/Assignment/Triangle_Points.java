package ChapterTwo.Test.Assignment;

import java.util.*;

public class Triangle_Points

{

public static void main (String[] args) 

{

    float x1,x2,y1,y2,x3,y3;


    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the coordinate of first point (x1,y1):");



    x1=scan.nextFloat();

    y1=scan.nextFloat();

    System.out.println("Enter the coordinate of second point (x2,y2):");



    x2=scan.nextFloat();

    y2=scan.nextFloat();

    System.out.println("Enter the coordinate of third point (x3,y3):");



    x3=scan.nextFloat();

    y3=scan.nextFloat();



    float area_tri=Math.abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2);

    System.out.println("area of the triangle:"+area_tri);


}

}