
import java.util.ArrayList;

public class HashMap<K, V> {

    private ArrayList<Pair<K,V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new ArrayList[32];
        this.firstFreeIndex = 0;

        for (int i = 0; i < this.values.length; i++) {
            this.values[i] = new ArrayList<>();
        }
    }
    

    private ArrayList<Pair<K,V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % values.length);

        return values[hashValue];
    }

    private int getIndexOfKey(ArrayList<Pair<K,V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getKey().equals(key)) {
                return i;
            }
        }

        return -1;
    }

    private void grow() {
        // create a new array
      ArrayList<Pair<K,V>>[] newArray = new ArrayList[this.values.length * 2];

        for (int i = 0; i < this.values.length; i++) {
            copy(newArray, i);
        }

        this.firstFreeIndex = 0;
        this.values = newArray;
    }

    public void add(K key, V value) {
        ArrayList<Pair<K,V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }

        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }

    private void copy(ArrayList<Pair<K,V>>[] newArray, int fromIdx) {
        for (int i = 0; i < this.values[fromIdx].size(); i++) {
            Pair<K, V> value = this.values[fromIdx].get(i);

            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if(newArray[hashValue] == null) {
                newArray[hashValue] = new ArrayList<>();
            }

            newArray[hashValue].add(value);
        }
    }

    public V remove(K key) {
        ArrayList<Pair<K,V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.isEmpty()) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(pair);
        this.firstFreeIndex--;
        return pair.getValue();
    }

}

