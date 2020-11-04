package algorithms.sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeSortTest {

    @Test
    public void shouldSortArray(){
        MergeSort mergeSort = new MergeSort();
        int[] array = { 12, 11, 13, 5, 6, 7 };
        mergeSort.sort(array, 0, 5);
        assertEquals(5, array[0]);
    }

}