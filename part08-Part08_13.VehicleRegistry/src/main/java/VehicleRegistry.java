
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registers = new HashMap<>();



    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.registers.containsKey(licensePlate)) {
            this.registers.put(licensePlate, owner);
            return true;
        }
        return false;
    }


    public String get(LicensePlate licensePlate) {
        return this.registers.getOrDefault(licensePlate, null);
    }


    public boolean remove(LicensePlate licensePlate) {
        if (this.registers.containsKey(licensePlate)) {
            this.registers.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : this.registers.keySet()) {
            System.out.println(plate);
        }

    }

    public void printOwners() {
        List<String> impressos = new ArrayList<>();
        
        for (String owner : this.registers.values()) {
            if (!impressos.contains(owner)) {
                impressos.add(owner);
                System.out.println(owner);
            }
            
        }

    }
}
