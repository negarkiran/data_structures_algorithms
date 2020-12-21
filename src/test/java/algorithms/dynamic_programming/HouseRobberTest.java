package algorithms.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseRobberTest {

    @Test
    public void shouldFindPossibleAmountThatCanBeRobbed() {
        HouseRobber houseRobber = new HouseRobber();
        int[] cashOne = {6, 7, 1, 3, 8, 2, 4};
        assertEquals(19, houseRobber.rob(cashOne));

        int[] cashTwo = {5, 3, 4, 11, 2};
        assertEquals(16, houseRobber.robWithoutSpace(cashTwo));
    }

}