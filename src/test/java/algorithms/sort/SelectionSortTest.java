package algorithms.sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SelectionSortTest {

    private SelectionSort selectionSort;

    @Before
    public void setup() {
        selectionSort = new SelectionSort();
    }

    @Test
    public void shouldSortArrayUsingBubbleSort() {
        int[] input = {98,71,99,22,15,17,31};
        selectionSort.sort(input);
        assertEquals(99, input[6]);
    }
}