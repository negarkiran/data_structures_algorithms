package datastructures.array.twosum;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TwoSumOnASortedRotatedArrayTest {

    @Test
    public void shouldFindSumOfTwoElementsIsAvailableInSortedArray() {
        TwoSumOnASortedRotatedArray twoSumOnASortedRotatedArray = new TwoSumOnASortedRotatedArray();
        int[] array = {4, 5, 6, 1, 2, 3};

        assertTrue(twoSumOnASortedRotatedArray.hasSumInArray(array, 3));
    }

    @Test
    public void shouldNotFindSumOfTwoElementsIsAvailableInSortedArray() {
        TwoSumOnASortedRotatedArray twoSumOnASortedRotatedArray = new TwoSumOnASortedRotatedArray();
        int[] array = {4, 5, 6, 1, 2, 3};

        assertFalse(twoSumOnASortedRotatedArray.hasSumInArray(array, 15));
    }
}