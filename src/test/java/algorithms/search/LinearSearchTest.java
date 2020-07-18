package algorithms.search;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinearSearchTest {
    private LinearSearch linearSearch;

    @Before
    public void setup(){
        linearSearch = new LinearSearch();
    }

    @Test
    public void shouldSearchElementInAnArray() {
        int[] array = {48,22,95,31,1,67,72,84,26, 98};
        assertEquals(6, linearSearch.search(array, 72));
    }
}