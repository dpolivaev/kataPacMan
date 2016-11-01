package pacman;

public class Pacman {
    public final Coordinate position;

    public final Direction direction;

    public Pacman(Coordinate position, Direction direction) {
        super();
        this.position = position;
        this.direction = direction;
    }

    public Pacman calculateNewPacmanPosition(Dimension boardDimension) {
        Coordinate newPacmanPosition = position.coordinateInDirection(direction);
        if (boardDimension.isContained(newPacmanPosition)) {
            return new Pacman(newPacmanPosition, direction);
        } else {
            return new Pacman(position, direction.invert());
        }
    }
}