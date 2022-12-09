package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerUtmeTest {
    @Test
    public void utmeDrillerTestOne(){
        //Given That We have a class
        utmeTestOne utmeTestOne =new utmeTestOne();
        // When We Want We want Copies Between 1 - 4
        int copy = utmeTestOne.buycopies(4);
        //Check that Copies Multiplied By #2,000 is #8,000
        assertEquals(8_000,utmeTestOne.buycopies(4));

    }

    @Test
    public void utmeDrillerTestTwo(){
        //Given That We have a class
        utmeTestOne utmeTestOne =new utmeTestOne();
        // When We Want We want Copies Between 5 - 9
        // int copy = utmeTestOne.buycopies(9);
        //Check that Copies Multiplied By #1,800 is #16,200
        assertEquals(16_200,utmeTestOne.buycopies(9));

    }

    @Test
    public void utmeDrillerTestThree(){
        //Given That We have a class
        utmeTestOne utmeTestOne =new utmeTestOne();
        // When We Want We want Copies Between 10 - 29
        // int copy = utmeTestOne.buycopies(29);
        //Check that Copies Multiplied By #1,600 is #46,400
        assertEquals(46_400,utmeTestOne.buycopies(29));

    }


    @Test
    public void utmeDrillerTestFour(){
        //Given That We have a class
        utmeTestOne utmeTestOne =new utmeTestOne();
        // When We Want We want Copies Between 30 - 49
        // int copy = utmeTestOne.buycopies(49);
        //Check that Copies Multiplied By #1,500 is #73,500
        assertEquals(73_500,utmeTestOne.buycopies(49));

    }

    @Test
    public void utmeDrillerTestFive(){
        //Given That We have a class
        utmeTestOne utmeTestOne =new utmeTestOne();
        // When We Want We want Copies Between 50 - 99
        // int copy = utmeTestOne.buycopies(99);
        //Check that Copies Multiplied By #1,300 is #128,700
        assertEquals(128_700,utmeTestOne.buycopies(99));

    }



    @Test
    public void utmeDrillerTestSix() {
        //Given That We have a class
        utmeTestOne utmeTestOne = new utmeTestOne();
        // When We Want We want Copies Between 100 - 199
        // int copy = utmeTestOne.buycopies(199);
        //Check that Copies Multiplied By #1,200 is #238,800
        assertEquals(238_800, utmeTestOne.buycopies(199));
    }


    @Test
    public void utmeDrillerTestSeven() {
        //Given That We have a class
        utmeTestOne utmeTestOne = new utmeTestOne();
        // When We Want We want Copies Between 200 - 499
        // int copy = utmeTestOne.buycopies(499);
        //Check that Copies Multiplied By #1,100 is #548,900
        assertEquals(548_900, utmeTestOne.buycopies(499));
    }



    @Test
    public void utmeDrillerTestEight() {
        //Given That We have a class
        utmeTestOne utmeTestOne = new utmeTestOne();
        // When We Want We want Copies Between 500 and Above
        // int copy = utmeTestOne.buycopies(500);
        //Check that Copies Multiplied By #1,000 is #500,000
        assertEquals(500_000, utmeTestOne.buycopies(500));
    }


}
