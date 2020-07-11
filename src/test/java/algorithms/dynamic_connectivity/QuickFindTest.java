package algorithms.dynamic_connectivity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuickFindTest {

    private QuickFind quickFind;

    @Before
    public void setup() {
        quickFind = new QuickFind(10);
    }

    @Test
    public void shouldFindIfTwoNodesAreConnected() {
        quickFind.union(0, 5);
        quickFind.union(5, 6);

        quickFind.union(2, 7);

        quickFind.union(3, 8);
        quickFind.union(8, 9);
        quickFind.union(9, 4);

        assertFalse(quickFind.connected(1, 2));
        assertTrue(quickFind.connected(3, 4));
    }

}