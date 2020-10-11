package algorithms.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SubsetSumDPTest {

    @Test
    public void shouldFindSubSetThatAddsToSum() {
        SubsetSumDP subsetSumDP = new SubsetSumDP();
        int[] set = {3, 34, 4, 12, 5, 2};
        assertTrue(subsetSumDP.isSubsetAddsToSum(set, 6 , 9));
    }

    @Test
    public void shouldNotFindSubSetThatAddsToSum() {
        SubsetSumDP subsetSumDP = new SubsetSumDP();
        int[] set = {3, 34, 4, 12, 5, 2};
        assertFalse(subsetSumDP.isSubsetAddsToSum(set, 6 , 30));
    }

}