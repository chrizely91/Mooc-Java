public class Cube {
    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume() {
        return (edgeLength * edgeLength * edgeLength);
    }

    @Override
    public String toString() {
        return String.format("The length of the edge is %d and the volume %d", this.edgeLength, volume());
    }
    
}
