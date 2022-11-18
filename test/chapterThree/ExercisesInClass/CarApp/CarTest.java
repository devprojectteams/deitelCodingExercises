package chapterThree.ExercisesInClass.CarApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {

    @Test
    public void TestThatCarCanBeCreated(){
        Car benz = new Car("G-390", "2022", 50.00);
        assertNotNull(benz);
    }

    @Test
    public void TestThatCarsAttributesAreProperlyInitialized() {
        Car benz = new Car("G-390", "2022", 50.00);
        assertEquals("G-390", benz.getModel());
        assertEquals("2022", benz.getYear());
        assertEquals(50.00, benz.getPrice());

    }


    @Test
    public void testDiscount(){
        Car benz = new Car("G-390", "2022", 50.00);
        benz.applyDiscount(10);
        
    }
}

