package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private List<Integer> readingsHistory;
    

    public AverageSensor() {
        sensors = new ArrayList<>();
        readingsHistory = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == false) {
                sensor.setOn();
            }
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == true) {
                sensor.setOff();
            }
        }
    }

    @Override
    public int read() {
        if (sensors.isEmpty()) {
            throw new IllegalStateException("Não há sensores");
        }
        int soma = 0;

        for (Sensor sensor : sensors) {
            soma += sensor.read();
        }

        int average = soma / sensors.size();
        readingsHistory.add(average); 
        return average;
         
    }

    public List<Integer> readings() {
    return new ArrayList<>(readingsHistory);
}

}
