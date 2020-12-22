package algorithms.misc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WorstTimeToBuyAndSellStockTest {
    @Test
    public void shouldFindWorstTimeToBuyAndSell() {
        WorstTimeToBuyAndSellStock worstTimeToBuyAndSellStock = new WorstTimeToBuyAndSellStock();
        int[] stockPrices = {7, 1, 5, 3, 6, 4};
        assertEquals(-6, worstTimeToBuyAndSellStock.buyAndSell(stockPrices));
    }
}