package algorithms.search;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JumpSearchTest {
    private JumpSearch jumpSearch;

    @Before
    public void setup(){
        jumpSearch = new JumpSearch();
    }

    @Test
    public void shouldSearchElementInAnArray() {
        int[] array = {1,22,26,31,48,67,72,84,95, 98};
        assertEquals(6, jumpSearch.search(array, 72));
    }
}