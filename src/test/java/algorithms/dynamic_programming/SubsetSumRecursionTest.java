package algorithms.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SubsetSumRecursionTest {

    @Test
    public void shouldFindSubSetThatAddsToSum() {
        SubsetSumRecursion subsetSumRecursion = new SubsetSumRecursion();
        int[] set = {3, 34, 4, 12, 5, 2};
        assertTrue(subsetSumRecursion.isSubsetAddsToSum(set, 6 , 9));
    }

    @Test
    public void shouldNotFindSubSetThatAddsToSum() {
        SubsetSumRecursion subsetSumRecursion = new SubsetSumRecursion();
        int[] set = {3, 34, 4, 12, 5, 2};
        assertFalse(subsetSumRecursion.isSubsetAddsToSum(set, 6 , 30));
    }
}