
import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {
    
    public static void main(String[] args) {

        try {
            Files.lines(Paths.get("literacy.csv"))
                .map(line -> line.split(","))
                .filter(line -> line.length == 6)
                .map(parts -> new String[] {
                    parts[3].trim(),      
                    parts[4].trim(),         
                    parts[2].trim().replaceAll(" \\(%\\)", ""),         
                    parts[5].trim()          
                })
                .sorted((p1, p2) -> Double.compare(
                    Double.parseDouble(p1[3]),
                    Double.parseDouble(p2[3])))
                .forEach(parts -> System.out.printf("%s (%s), %s, %s%n",
                    parts[0], parts[1], parts[2], parts[3]));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
