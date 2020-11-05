package algorithms.search;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FrontBackSearchTest {

    @Test
    public void shouldSearchItemInArray() {
        FrontBackSearch frontBackSearch = new FrontBackSearch();
        int[] arr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        assertTrue(frontBackSearch.isPresent(arr, 130));
        assertFalse(frontBackSearch.isPresent(arr, 131));
    }

}