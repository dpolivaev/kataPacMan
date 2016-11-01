package pacman;

import java.util.HashSet;
import java.util.Set;

public class PacmanGame {

    public Pacman pacman;

    int eatenDotCount = 0;

    Dimension boardDimension;

    Set<Coordinate> visitedPositions = new HashSet<>();

    public PacmanGame(Dimension dimension, Coordinate initialPosition, Direction direction) {
        this.boardDimension = dimension;
        this.pacman = new Pacman(initialPosition, direction);
    }

    public Coordinate getPacmanPosition() {
        return pacman.position;
    }

    public Direction getPacmanDirection() {
        return pacman.direction;
    }

    public void movePacman() {
        visitedPositions.add(pacman.position);

        pacman = pacman.calculateNewPacmanPosition(boardDimension);

        if (!visitedPositions.contains(pacman.position)) {
            eatenDotCount++;
        }
    }

    public int getEatenDots() {
        return eatenDotCount;
    }

}
