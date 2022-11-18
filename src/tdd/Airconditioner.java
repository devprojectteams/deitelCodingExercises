package tdd;

public class Airconditioner {
    private boolean isOn;
    private boolean isOff;
    private int temperature;

    public void setOn(boolean powerOn) {
        isOn = powerOn;
        if (isOn){
            isOff = false;
        }
    }
    public boolean getIsOn() {
        return isOn;
    }

    public void setOff(boolean powerOff) {
        isOff = powerOff;
        if (isOff){
            isOn = false;
        }
    }

    public boolean getIsOff() {
        return isOff;
    }

    public void setTemperature(int degrees) {
        if (isOn && degrees >= 16 && degrees <= 30){
            temperature = degrees;
        }
    }
    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature (int degrees){
        if (isOn && temperature + degrees <= 30){
            temperature = temperature + degrees;
        }
        else if (temperature + degrees > 30) {
            temperature = 30;
        }
    }
    public void decreaseTemperature (int degrees){
        if (isOn && temperature - degrees >= 16) {
            temperature = temperature - degrees;
        } else if (temperature - degrees < 16) {
            temperature = 16;
        }
    }
}

