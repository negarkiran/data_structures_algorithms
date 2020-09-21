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
    public void shouldSortArray() {
        int[] input = {98,71,99,22,15,17,31};
        selectionSort.sort(input);
        assertEquals(99, input[6]);
    }

    @Test
    public void shouldSortArrayCaseOne() {
        int[] input = {7,1,3,2,4,5,6};
        selectionSort.sort(input);
        assertEquals(7, input[6]);
    }
}