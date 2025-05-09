public class Timer {

    private int seconds;
    private int hundredths;
    private final int LIMIT_SECONDS = 60;
    private final int LIMIT_HUNDREDTHS = 100;

    public Timer() {
        this.seconds = 0;
        this.hundredths = 0;
    }

    public void advance() {
        this.hundredths = this.hundredths + 1;

        if (this.hundredths >= this.LIMIT_HUNDREDTHS) {
            this.hundredths = 0;
            this.seconds += 1;
        }

        if (this.seconds >= this.LIMIT_SECONDS) {
            this.seconds = 0;
        }
    }

    public String toString() {

        return (String.format("%02d", seconds) + ":" + String.format("%02d", hundredths));
    }
}