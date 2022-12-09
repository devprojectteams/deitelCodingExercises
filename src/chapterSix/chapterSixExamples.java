package chapterSix;

public class chapterSixExamples {

    public static void main(String... regnos) {
    char ch = 'A';
    printNumberAsInteger(ch);
    printNumberAsInteger(7.2);
    printNumberAsInteger("50");
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Double.MAX_VALUE);
    System.out.println(Long.MAX_VALUE);
}
    private static void printNumberAsInteger(int number, int i){
        System.out.println(number);
    }
       private static void printNumberAsInteger(double number){
           // String[] s =String.valueOf(number).split(regex "\\.");
           // var s; String = String.valueOf(number).split("\\.");
           // System.out.println(Integer.parseInt(s[0]));
           System.out.println((int)number);
        }

        private static void printNumberAsInteger(String number) {
            System.out.println(Integer.parseInt(number));
        }

        
    }

