package pacman;

import org.junit.Test;

import com.tngtech.jgiven.junit.SimpleScenarioTest;

public class PacmanGame0Test extends SimpleScenarioTest<PacmanStage> {
    @Test
    public void pacman_does_not_move_when_at_the_wall() throws Exception {
        given().a_board_with_size(1, 1)
                .and().pacman_at_initial_position(0, 0).looking(Direction.UP);

        when().pacman_moves();

        then().pacman_is_at_position(0, 0);

    }
}
