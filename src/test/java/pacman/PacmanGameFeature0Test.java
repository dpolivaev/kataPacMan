package pacman;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.jgiven.junit.SimpleScenarioTest;

@RunWith(DataProviderRunner.class)
public class PacmanGameFeature0Test extends SimpleScenarioTest<PacmanStage> {
    @DataProvider({
            "UP, DOWN",
            "DOWN, UP" })
    @Test
    public void pacman_does_not_move_and_changes_direction_when_at_the_wall(Direction initial,
            Direction after)
            throws Exception {
        given().a_board_with_size(1, 1)
                .and().pacman_at_initial_position(0, 0).looking(initial);

        when().pacman_moves();

        then().pacman_is_at_position(0, 0).and().is_looking(after);

    }

    @Test
    public void pacman_looking_up_does_not_move_and_changes_direction_when_at_the_wall()
            throws Exception {
        given().a_board_with_size(1, 1)
                .and().pacman_at_initial_position(0, 0).looking(Direction.UP);

        when().pacman_moves();

        then().pacman_is_at_position(0, 0).and().is_looking(Direction.DOWN);
    }

    @Test
    public void pacman_looking_down_does_not_move_and_changes_direction_when_at_the_wall()
            throws Exception {
        given().a_board_with_size(1, 1)
                .and().pacman_at_initial_position(0, 0)
                .looking(Direction.DOWN);

        when().pacman_moves();

        then().pacman_is_at_position(0, 0)
                .and().is_looking(Direction.UP);

    }

    @Test
    public void pacman_moves_and_keeps_direction_when_not_at_wall()
            throws Exception {
        given().a_board_with_size(1, 2)
                .and().pacman_at_initial_position(0, 1)
                .looking(Direction.UP);

        when().pacman_moves();

        then().pacman_is_at_position(0, 0)
                .and().is_looking(Direction.UP);
    }

    @Test
    public void pacman_eats_dots_when_moving() {
        given().a_board_with_size(1, 2)
                .and().pacman_at_initial_position(0, 1)
                .looking(Direction.UP);

        when().pacman_moves();

        then().pacman_has_eaten_$_dots(1);
    }

    @Test
    public void not_moving_pacman_eats_no_dots()
            throws Exception {
        given().a_board_with_size(1, 1)
                .and().pacman_at_initial_position(0, 0)
                .looking(Direction.UP);

        when().pacman_moves();

        then().pacman_has_eaten_$_dots(0);
    }

    @Test
    public void pacmen_eats_no_dots_twice()
            throws Exception {
        given().a_board_with_size(1, 3)
                .and().pacman_at_initial_position(0, 2)
                .looking(Direction.UP);

        when().pacman_moves_$_times(4);

        then().pacman_has_eaten_$_dots(2)
                .and().pacman_is_at_position(0, 1);
    }

    @Test
    public void initial_pacman_position_has_no_dot()
            throws Exception {
        given().a_board_with_size(1, 2)
                .and().pacman_at_initial_position(0, 1)
                .looking(Direction.UP);

        when().pacman_moves_$_times(3);

        then().pacman_has_eaten_$_dots(1)
                .and().pacman_is_at_position(0, 1);
    }

}
