package pacman;

import com.tngtech.jgiven.Stage;

public class PacmanStage extends Stage<PacmanStage> {

    public PacmanStage a_board_with_size(int width, int height) {
        return self();
    }

    public PacmanStage pacman_at_initial_position(int x, int y) {
        return self();

    }

    public PacmanStage looking(Direction direction) {
        return self();

    }

    public PacmanStage pacman_moves() {
        return self();

    }

    public void pacman_is_at_position(int x, int y) {

    }

}
