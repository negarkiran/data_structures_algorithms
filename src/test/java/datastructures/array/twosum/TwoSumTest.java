package datastructures.array.twosum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {
    private TwoSum twoSum;

    @Before
    public void setup() {
        twoSum = new TwoSum();
    }

    @Test
    public void shouldFindTwoIndices() {
        int[] numbers = {11,2,32,4,51,6,7,18};
        int[] result = twoSum.twoSum(numbers, 20);
        assertEquals(1, result[0]);
        assertEquals(7, result[1]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException() {
        int[] numbers = {11,2,32,4,51,6,7,18};
        twoSum.twoSum(numbers, 21);
    }

}