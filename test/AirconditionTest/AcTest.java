package AirconditionTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AcTest {

    @Test
    public void checkAcIsOn() {
        //Given that i have an Ac
        Ac sony = new Ac();
        sony.turnOn();
        assertTrue(sony.isOn());
    }

    @Test
    public void checkAcIsOff() {
        //Given that i have an Ac
        Ac sony = new Ac();
        sony.turnOff();
        assertFalse(sony.isOn());
    }

    @Test
    public void checkThatTemperatureCanIncrease() {
        //Given that i have an Ac
        Ac sony = new Ac();
        assertFalse(sony.isOn());
        sony.turnOn();
        assertTrue(sony.isOn());
        // When I increase Temperature
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        // Check that Temperature is increased to 19
        assertEquals(19, sony.getTemperature());
    }


    @Test
    public void checkThatTemperatureCanDecrease() {
        //Given that i have an Ac
        Ac sony = new Ac();
        assertFalse(sony.isOn());
        sony.turnOn();
        assertTrue(sony.isOn());
        // When I increase Temperature
        sony.increaseTemperature();
        assertEquals(17, sony.getTemperature());
        // Check that Temperature is decreased to 16
        sony.decreaseTemperature();
        assertEquals(16, sony.getTemperature());

    }


    @Test
    public void checkThatTemperatureNeverIncreaseAbove30() {
        //Given that i hva an Ac
        Ac sony = new Ac();
        assertFalse(sony.isOn());
        sony.turnOn();
        assertTrue(sony.isOn());
        // When I increase Temperature, never exceed 30
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        // Check that Temperature is never decrease below 16
        assertEquals(30, sony.getTemperature());
    }

    @Test
    public void checkThatTemperatureNeverDecreaseAbove30() {
        //Given that i hva an Ac
        Ac sony = new Ac();
        assertFalse(sony.isOn());
        sony.turnOn();
        assertTrue(sony.isOn());
        // When I decrease Temperature, never decrease below 16
        sony.decreaseTemperature();
        sony.decreaseTemperature();
        // Check that Temperature is never decrease below 16
        assertEquals(16, sony.getTemperature());

    }
}
