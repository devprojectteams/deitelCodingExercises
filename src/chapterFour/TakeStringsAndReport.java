package chapterFour;

import java.util.*;

public class TakeStringsAndReport {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder allNumbers = new StringBuilder();
        List<Integer> nums = new ArrayList<>();
        System.out.println("continue or stop");
        String userInput = scanner.next();

        while (!userInput.equals("stop")){
           System.out.println("enter number");
           //1. collect number
           //2. if user enters non-digit respond with olodorabata
           String userNumber = scanner.next();
           try {
               int number =  Integer.parseInt(userNumber);
               allNumbers.append(number);
               allNumbers.append(",");
           }catch(NumberFormatException ex){
               System.out.println("olodo rabata ni e, I said enter a number");
           }
           System.out.println("continue or stop");
           userInput= scanner.next();
       }
        String s = allNumbers.toString();
        String[] s1=s.split(",");
        for (int i = 0; i < s1.length; i++) {
            nums.add(Integer.parseInt(s1[i]));
        }
       Integer max =Collections.max(nums);
        System.out.println("maximum:: "+max);
    }

}
