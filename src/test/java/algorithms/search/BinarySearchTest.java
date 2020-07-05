package algorithms.search;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private BinarySearch binarySearch;

    @Before
    public void setup(){
        binarySearch = new BinarySearch();
    }

    @Test
    public void shouldSearchElementInAnArray() {
        int[] array = {1,22,26,31,48,67,72,84,95, 98};
        assertEquals(6, binarySearch.search(array, 72));
    }

}