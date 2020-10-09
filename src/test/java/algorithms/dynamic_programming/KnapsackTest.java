package algorithms.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnapsackTest {
    @Test
    public void shouldFindMaximumValuePossibleFromKnapsack(){
        Knapsack knapsack = new Knapsack(new int[]{10, 20, 30}, new int[]{60, 100, 120}, 50);
        assertEquals(220, knapsack.findMaximum(2, 50));
    }

}