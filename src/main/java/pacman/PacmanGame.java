package pacman;

public class PacmanGame {

    private Coordinate pacmanPosition;

    public PacmanGame(Dimension dimension, Coordinate initialPosition, Direction direction) {
        this.pacmanPosition = initialPosition;
    }

    public void movePacman() {

    }

    public Coordinate getPacmanPosition() {
        return pacmanPosition;
    }

    public Direction getPacmanDirection() {
        return Direction.DOWN;
    }

}
