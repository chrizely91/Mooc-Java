

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    
    public boolean equals(Object compared) {

        Person newPerson = (Person) compared;

        return  this.birthday.getYear() == newPerson.birthday.getYear() &&
                this.birthday.getMonth() == newPerson.birthday.getMonth() &&
                this.birthday.getDay() == newPerson.birthday.getDay() &&
                this.name.equals(newPerson.name) &&
                this.height == newPerson.height &&
                this.weight == newPerson.weight;
    }
    // implement an equals method here for checking the equality of objects
}
