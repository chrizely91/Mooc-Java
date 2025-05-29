
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String arquivo = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner scanFile = new Scanner(Paths.get(arquivo))) {
            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();

                if (!row.contains(team)) {
                    continue;
                }

                games++;
                String[] partes = row.split(",");

                String casa = partes[0];
                String visitante = partes[1];
                int placarCasa = Integer.parseInt(partes[2]);
                int placarVisitante = Integer.parseInt(partes[3]);

                if (casa.contains(team) && placarCasa > placarVisitante) {
                    wins++;
                } else if (casa.contains(team) && placarCasa < placarVisitante) {
                    losses++;
                } else if ((visitante.contains(team) && placarCasa < placarVisitante)) {
                    wins++;
                } else {
                    losses++;
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
    
}
