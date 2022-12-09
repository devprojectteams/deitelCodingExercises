package chapterSix;

public class PrimeNumbers {
    public static boolean isPrime(int number) {
        if(number < 2) {
            return false;
        }
        if(number % 2 == 0 && number != 2) {
            return false;
        }
        for (int countNumberTested = 2; countNumberTested <= Math.sqrt(number); countNumberTested++) {
            if(number % countNumberTested == 0) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
      //  int numberOfPrimeNumber = 0;
        for (int countNumberTested = 2; countNumberTested < 1000; countNumberTested++) {
            if(isPrime(countNumberTested))
               // numberOfPrimeNumber++;
            {
                System.out.printf("%d%s%b%n", countNumberTested, " is a prime number is ", isPrime(countNumberTested));
               // System.out.printf("%d%s%n",  numberOfPrimeNumber++, " is the number of prime number in 1000 ");
            }

        }
    }
}