
public class HealthStation {
    private int count = 0;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        count++;
        return person.getWeight();
    }

    public void feed(Person person) {
        // return the weight of the person passed as the parameter
        int weight = person.getWeight();
        person.setWeight(weight + 1);
    }

    public int weighings() {
        return count;
    }

}
