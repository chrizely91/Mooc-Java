import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> facilities;

    public StorageFacility() {
        this.facilities = new HashMap<>();
    }



    public void add(String unit, String item) {
        this.facilities.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> contents = this.facilities.get(unit);
        contents.add(item);
    }


    public ArrayList<String> contents(String storageUnit) {
        return new ArrayList<>(this.facilities.getOrDefault(storageUnit, new ArrayList()));
    }

    public void remove(String storageUnit, String item) {
        List<String> items = this.facilities.get(storageUnit);

        items.remove(item);

        if (items.isEmpty()) {
            this.facilities.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();

        for (String key : this.facilities.keySet()) {
            if (!this.facilities.get(key).isEmpty()) {
                units.add(key);
            }
        }

        return units;

    }
}
