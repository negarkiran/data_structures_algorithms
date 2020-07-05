package algorithms.sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    private BubbleSort bubbleSort;

    @Before
    public void setup() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void shouldSortArrayUsingBubbleSort() {
        int[] input = {98,71,99,22,15,17,31};
        bubbleSort.sort(input);
        assertEquals(99, input[6]);
    }

    @Test
    public void shouldNotTakeNSquareTimeForSortedArray() {
        int[] input = {1,2,3,4,5};
        bubbleSort.sort(input);
        assertEquals(5, input[4]);
    }
}