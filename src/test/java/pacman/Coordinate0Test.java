package pacman;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;

@RunWith(DataProviderRunner.class)
public class Coordinate0Test {

    @DataProvider({
            "0,1,UP,0,0",
            "0,1,DOWN,0,2",
    })
    @Test
    public void coordinateInDirectionIs(int x, int y, Direction direction,
            int expectedX, int expectedY) {
        assertThat(new Coordinate(x, y).coordinateInDirection(direction))
                .isEqualToComparingFieldByField(new Coordinate(expectedX, expectedY));
    }

}
