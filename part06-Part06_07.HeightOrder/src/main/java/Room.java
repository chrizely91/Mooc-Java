import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people = new ArrayList<>(); 

    public void add(Person person) {
        people.add(person);
    }

    public boolean isEmpty() {
        return people.isEmpty();
    }


    public ArrayList<Person> getPersons() {
        return people;
    }

    public Person shortest() {
        if (people.isEmpty()) {
            return null;
        }

        Person shorter = people.get(0);
        
        for (Person person : people) {
            if (person.getHeight() < shorter.getHeight()) {
                shorter = person;
            }
        }
        return shorter;
    }


    public Person take() {
        if (people.isEmpty()) {
            return null;
        }

        Person shorter = this.shortest();

        people.remove(shorter);

        return shorter;
    }
} 
