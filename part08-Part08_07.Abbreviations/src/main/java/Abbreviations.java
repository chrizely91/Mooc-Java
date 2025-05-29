import java.util.HashMap;

public class Abbreviations {
    private final HashMap<String, String> list;


    public Abbreviations() {
        this.list = new HashMap<>();
    }


    public void addAbbreviation(String abbreviation, String explanation) {
        if (!this.hasAbbreviation(abbreviation)) {
            list.put(abbreviation, explanation);
        }
    }


    public boolean hasAbbreviation(String abbreviation) {
       return list.containsKey(abbreviation);
    }


    public String findExplanationFor(String abbreviation) {
        return list.get(abbreviation);
    }
    

}
