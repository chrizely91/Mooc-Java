package application;

public class StandardSensor implements Sensor {
    private int temperature;

    public StandardSensor (int temperature) {
        this.temperature = temperature;
    }

    @Override
    public int read() {
        return this.temperature;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {}

    @Override
    public void setOff() {}

}
