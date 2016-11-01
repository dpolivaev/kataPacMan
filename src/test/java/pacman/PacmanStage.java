package pacman;

import static org.assertj.core.api.Assertions.assertThat;

import com.tngtech.jgiven.Stage;

public class PacmanStage extends Stage<PacmanStage> {

    private PacmanGame pacmanGame;

    private int width;

    private int height;

    private int x;

    private int y;

    public PacmanStage a_board_with_size(int width, int height) {
        this.width = width;
        this.height = height;
        return self();
    }

    public PacmanStage pacman_at_initial_position(int x, int y) {
        this.x = x;
        this.y = y;
        return self();

    }

    public PacmanStage looking(Direction direction) {
        pacmanGame = new PacmanGame(new Dimension(width, height), new Coordinate(x, y), direction);
        return self();

    }

    public PacmanStage pacman_moves() {
        pacmanGame.movePacman();
        return self();

    }

    public PacmanStage pacman_is_at_position(int x, int y) {
        assertThat(pacmanGame.getPacmanPosition()).isEqualToComparingFieldByField(
                new Coordinate(x, y));
        return self();
    }

    public PacmanStage is_looking(Direction direction) {
        assertThat(pacmanGame.getPacmanDirection()).isEqualTo(direction);
        return self();
    }

    public PacmanStage pacman_has_eaten_$_dots(int numberOfEatenDots) {
        assertThat(pacmanGame.getEatenDots()).isEqualTo(numberOfEatenDots);
        return self();
    }

    public void pacman_moves_$_times(int n) {
        for (int i = 0; i < n; i++) {
            pacman_moves();
        }
    }

}
