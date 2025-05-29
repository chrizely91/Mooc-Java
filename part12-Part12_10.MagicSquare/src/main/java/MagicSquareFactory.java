
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int x =  size / 2;
        int y = 0;

        for (int i = 1; i <= size * size; i++) {
            square.placeValue(x, y, i);
            int nextX = x + 1;
            int nextY = y - 1;

            if (nextY < 0) {
                nextY = size - 1;
            }

            if (nextX >= size) {
                nextX = 0;
            }

            if (square.readValue(nextX, nextY) == 0) {
                x = nextX;
                y = nextY;
            } else {
                y = (y + 1) % size;
            }

        }
        return square;
    }

}
