package chapterFour;


public class WhileLoopIterationExample {
    public static void main(String[] args) {


        int number = 3;
        while (number <= 100) {
            int multiple = number * 3;
            number = multiple;
            System.out.println(number);

        }
    }
}
