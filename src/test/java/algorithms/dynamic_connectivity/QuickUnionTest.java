package algorithms.dynamic_connectivity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuickUnionTest {

    private QuickUnion quickUnion;

    @Before
    public void setup(){
        quickUnion = new QuickUnion(5);
    }

    @Test
    public void shouldFindIfTwoNodesAreConnected() {
        quickUnion.union(1, 0);
        quickUnion.union(2, 1);

        quickUnion.union(1, 3);

        assertFalse(quickUnion.connected(1, 4));
        assertTrue(quickUnion.connected(1, 3));
    }
}