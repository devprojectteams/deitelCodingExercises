package KataFunctionTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void squareTest(){
        Kata kata = new Kata();
        int result = kata.SquareOf(100 );
        assertEquals(10000, result);
    }


    public class addTest {
        @Test
        public void addTest() {
            Kata kata = new Kata();
            int sum = kata.add(12, 2);
            assertEquals(14, sum);
        }
    }


        @Test
        public void maxTest() {
            Kata kata = new Kata();
            int maximum = kata.number(23, 12);
            assertEquals(23, maximum);
        }
    }
