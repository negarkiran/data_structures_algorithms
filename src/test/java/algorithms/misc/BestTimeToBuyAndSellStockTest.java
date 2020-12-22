package algorithms.misc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void shouldFindBestTimeToBuyAndSell() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int[] stockPrices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, bestTimeToBuyAndSellStock.buyAndSell(stockPrices));
    }

}