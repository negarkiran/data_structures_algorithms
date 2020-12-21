package algorithms.misc;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ThreeSumTest {

    @Test
    public void shouldFindNumbersFormingSumZero() {
        ThreeSum threeSum = new ThreeSum();
        Integer[] array = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum.threeSum(array);
        assertEquals(2, lists.size());
    }

}