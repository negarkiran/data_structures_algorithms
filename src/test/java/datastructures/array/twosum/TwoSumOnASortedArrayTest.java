package datastructures.array.twosum;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TwoSumOnASortedArrayTest {

    @Test
    public void shouldFindSumOfTwoElementsIsAvailableInSortedArray() {
        TwoSumOnASortedArray twoSumOnASortedArray = new TwoSumOnASortedArray();
        int[] array = {-8, 1, 4, 6, 10, 45};

        assertTrue(twoSumOnASortedArray.hasSumInArray(array, 16));
    }

    @Test
    public void shouldNotFindSumOfTwoElementsIsAvailableInSortedArray() {
        TwoSumOnASortedArray twoSumOnASortedArray = new TwoSumOnASortedArray();
        int[] array = {-8, 1, 4, 6, 10, 45};

        assertFalse(twoSumOnASortedArray.hasSumInArray(array, 15));
    }
}