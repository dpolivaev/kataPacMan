package pacman;

public class Dimension {

    public final int width;

    public final int height;

    public Dimension(int width, int height) {
        this.width = width;
        this.height = height;
    }

    boolean isContained(Coordinate c) {
        return c.y >= 0 && c.y < height;
    }

}
