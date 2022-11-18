//package AirconditionTest;
//
//import org.junit.jupiter.api.Test;
//import tdd.Airconditioner;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class AirconditionerTest {
//    @Test
//    public void AirconditioinerTestAcIsOn() {
//        // given there is an AC
//        Airconditioner sony = new Airconditioner();
//        // GIVEN THAT IT IS OFF
//        sony.setOff(true);
//        // given that it is on
//        sony.setOn(true);
//        // check that AC is On
//        boolean powerOn = sony.getIsOn();
//
//        assertTrue(powerOn);
//    }
//
//    @Test
//    public void AirconditioinerTestAcIsOff() {
//        // given there is an AC
//        Airconditioner sony = new Airconditioner();
//        // given that it is on
//        sony.setOn(true);
//        //GIVEN THAT IT IS OFF
//        sony.setOff(true);
//        // check that AC is Off
//        boolean powerOff = sony.getIsOff();
//
//        assertTrue(powerOff);
//    }
//
//    @Test
//    public void AirconditioinerTestIncreaseTemperature() {
//        // given there is an AC
//        Airconditioner sony = new Airconditioner();
//        // GIVEN THAT IT IS OFF
//        sony.setOff(true);
//        // given that it is on
//        sony.setOn(true);
//        // Given that Temperature is 18 Degrees
//        sony.setTemperature(18);
//        // Given that Temperature is increased by 10 Degrees
//        sony.increaseTemperature(10);
//        int temperature = sony.getTemperature();
//        // check that Temperature is 28 Degrees
//
//        assertEquals(28);
//
//    }
//
//    @Test
//    public void AirconditioinerTestIncreaseTemperatureAbove() {
//        // given there is an AC
//        Airconditioner sony = new Airconditioner();
//        // GIVEN THAT IT IS OFF
//        sony.setOff(true);
//        // given that it is on
//        sony.setOn(true);
//        // Given that Temperature is 18 Degrees
//        sony.setTemperature(18);
//        // Given that Temperature is increased by 20 Degrees
//        sony.increaseTemperature(20);
//        int temperature = sony.getTemperature();
//        // check that Temperature is 38 Degrees
//
//        assertEquals(38);
//
//    }
//
//    private void assertEquals(int degrees) {
//    }
//
//}