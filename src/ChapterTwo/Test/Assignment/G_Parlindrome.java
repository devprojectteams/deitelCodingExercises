package ChapterTwo.Test.Assignment;

import java.util.*;
class G_Palindrome
{
	public static void main(String[] arg)
	{
	    int number,t,s,rem;
             	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter any number ");
                   number=input.nextInt();
	    t=number;
	    for(s=0;number>0;number/=10)
	    {
	    rem=number%10;
	    s=(s*10)+rem;
	    }
	   if(s==t)
		System.out.println(t+" is a palindrome number ");
                  else
		System.out.println(t+" is not a palindrome number ");
                  
	}
}