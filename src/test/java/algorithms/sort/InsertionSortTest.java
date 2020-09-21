package algorithms.sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertionSortTest {

    private InsertionSort insertionSort;

    @Before
    public void setup() {
        insertionSort = new InsertionSort();
    }

    @Test
    public void shouldSortArray() {
        int[] input = {98,71,99,22,15,17,31};
        insertionSort.sort(input);
        assertEquals(99, input[6]);
    }

}