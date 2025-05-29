
public class Statistics {
    private int count = 0;
    private int sum = 0;

    public Statistics() {
        this.count = 0;
    } 

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (sum == 0) {
            return 0;
        }
        return (this.sum * 1.0) / this.count;
    }
}

