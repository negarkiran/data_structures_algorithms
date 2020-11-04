package algorithms.sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuickSortTest {

    @Test
    public void shouldSort() {
        QuickSort quickSort = new QuickSort();
        int[] input = {10, 7, 8, 9, 1, 5};
        quickSort.sort(input, 0, 5);
        assertEquals(1, input[0]);
    }

}