
import java.util.ArrayList;

public class Points {
    private ArrayList<Integer> points = new ArrayList<>();


    public void add(int number) {
        if (number >= 0 && number <= 100) {
            this.points.add(number);
        }        
    }

    public double average() {
        if (points.isEmpty()) return 0.0;

        int sum = 0;

        for (int point : this.points) {
            sum += point;
        }
        return (sum * 1.0) / this.points.size();
    }

    public double averageWithPassingGrade(int passing) {
        int sum = 0;
        int count = 0;

        for (int point : this.points) {
            if (point >= passing) {
                sum += point;
                count++;
            }
            
        }

        return count > 0 ? (double) sum / count : -1.0;
    }

    public double averageWithPassingGradeDefault() {        
        return averageWithPassingGrade(50);
    }


    public double percentage() {
        final int PASSING = 50;
        int count = 0;

        if (points.isEmpty()) return 0.0;

        for (int point : this.points) {
            if (point >= PASSING) {
                count++;
            }            
        }

        return (100.0 * count) / points.size();

    }

    public void printDistribution() {
        int[] gradeCounts = new int[6];


        for (int point : points) {
            if (point < 50) gradeCounts[0]++;
            else if (point < 60) gradeCounts[1]++;
            else if (point < 70) gradeCounts[2]++;
            else if (point < 80) gradeCounts[3]++;
            else if (point < 90) gradeCounts[4]++;
            else gradeCounts[5]++;
        }
        
        System.out.println("Grade distribution: ");
        for (int grade = 5; grade >= 0; grade--) {
            System.out.print(grade + ": ");
            for (int i = 0; i < gradeCounts[grade]; i++) {
                System.out.print("*");
            }
            System.out.println();
        }     

    }
}
