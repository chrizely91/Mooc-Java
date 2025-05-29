import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionaries;

    public DictionaryOfManyTranslations() {
        dictionaries = new HashMap<>();
    }


    public void add(String word, String translation) {
        this.dictionaries.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> translations = this.dictionaries.get(word);
        translations.add(translation);

    }


    public ArrayList<String> translate(String word) {
        return new ArrayList<>(this.dictionaries.getOrDefault(word, new ArrayList<>()));
    }


    public void remove(String word) {
        dictionaries.remove(word);
    }




}
