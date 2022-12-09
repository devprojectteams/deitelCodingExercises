package chapterSix;

public class ExampleOfRecursionInJavaForMethodStackCall {

    public static void main(String[] args) {

//        PATTERN_SPACING_DEFAULT_VALUE
        printRightFacing_RightAngledTriangle(5);
        printLeftFacing_RightAngledTriangle(6);
    }

    private static void printRightFacing_RightAngledTriangle(int number) {

        if (number < 1) return;
        number = number - 1;


        printRightFacing_RightAngledTriangle(number);
        for (int index = 0; index < number; index++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void printLeftFacing_RightAngledTriangle(int number) {

        if (number < 1)
            return;

        number = number - 1;
        printLeftFacing_RightAngledTriangle(number);
        for (int index = number; index < 6; index++) {
            System.out.print(" ");
        }
        for (int index = 0; index < number; index++) {
            System.out.print("*");
        }
        System.out.println();
    }
}


//PATTERN_SPACING_DEFAULT_VALUE