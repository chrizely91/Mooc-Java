
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String arquivo = scanner.nextLine();

        try (Scanner scanfile = new Scanner(Paths.get(arquivo))) {
            while (scanfile.hasNextLine()) { 
                String row = scanfile.nextLine();
                String[] partes = row.split(",");

                String name = partes[0];
                int age = Integer.parseInt(partes[1]);
                if (age != 1) {
                    System.out.println(name + ", age: " + age + " years");
                } else {
                    System.out.println(name + ", age: " + age + " year");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
