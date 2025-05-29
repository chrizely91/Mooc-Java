package application;
import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean active = false;

    public TemperatureSensor() {}

    public int randomTemperature() {
        if (!this.isOn()) {
            throw new IllegalStateException("Sensor desligado");
        }
        int num = new Random().nextInt(61);

        return num - 30;

    }

    @Override
    public boolean isOn() {
        return active;
    }

    @Override
    public void setOn() {
        this.active = true;
    }

    @Override
    public void setOff() {
         this.active = false;
    }

    @Override
    public int read() {
        return randomTemperature();
    }


}
