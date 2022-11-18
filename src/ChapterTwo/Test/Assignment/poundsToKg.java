package ChapterTwo.Test.Assignment;

import java.util.Scanner;
public class poundsToKg {
  public static void main(String[] args) {
  
    Scanner sc=new Scanner (System.in);
    System.out.println("menu\t");
    System.out.println("1. pounds to kg");
    System.out.println("2. kg to pounds");
    int n=sc.nextInt();
    System.out.println("enter data for conversion");
    double d=sc.nextDouble();
    String st="";
    double result=1;
    if(n==1)
      {result=d*0.4536;
        st="kg";}
    else
    {  result=d*2.2046;
        st="lbs";}
    System.out.println("after conversion: "+result+" "+st);
    
      
  }
}

