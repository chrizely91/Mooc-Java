package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
    private Map<String, String> translations;
    private String file;

    public SaveableDictionary() {
        this.translations = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public void add(String word, String translation) {
        if (!translations.containsKey(word)) {
            translations.put(word, translation);
            translations.put(translation, word);
        }
    }

    public String translate(String word) {
        return translations.get(word);
    }

    public void delete(String word) {
        String translation = translations.get(word);
        if (translation != null) {
            translations.remove(word);
            translations.remove(translation);
        }
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(new File(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    add(parts[0], parts[1]);
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(file)) {
            List<String> savedWords = new ArrayList<>();
        
            for (String word : translations.keySet()) {
                String translation = translations.get(word);
                
                if (!savedWords.contains(word) && !savedWords.contains(translation)) {
                    writer.println(word + ":" + translation);
                    savedWords.add(word);
                    savedWords.add(translation);
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}