package algorithms.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinsMemoizationTest {

    @Test
    public void shouldReturnMaximumPossibleAmericanDollars() {
        CoinsMemoization coinsMemoization = new CoinsMemoization();
        assertEquals(13, coinsMemoization.americanDollars(12));
        assertEquals(2, coinsMemoization.americanDollars(2));
    }

}