package algorithms.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumCostRecursionTest {

    @Test
    public void shouldReturnMinimumCost() {
        MinimumCostRecursion minimumCostRecursion = new MinimumCostRecursion();
        int[][] cost = { {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3} };
        assertEquals(8, minimumCostRecursion.minCost(cost, 2, 2));
    }

}