package AirconditionTest;

public class Ac {

    private boolean isOn;

    private int temperature = 16;
    public boolean isOn() {
        return isOn;
    }
    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void increaseTemperature() {
        if (isOn){
            temperature++;
        }
        if (temperature > 30){
            temperature = 30;
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if (isOn){
            temperature--;
            if (temperature < 16){
                temperature = 16;
            }
        }
    }
}
