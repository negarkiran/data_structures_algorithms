package algorithms.dynamic_connectivity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuickUnionWeightedTest {
    private QuickUnionWeighted quickUnionWeighted;

    @Before
    public void setup(){
        quickUnionWeighted = new QuickUnionWeighted(5);
    }

    @Test
    public void shouldFindIfTwoNodesAreConnected() {
        quickUnionWeighted.union(1, 0);
        quickUnionWeighted.union(2, 1);

        quickUnionWeighted.union(1, 3);

        assertFalse(quickUnionWeighted.connected(1, 4));
        assertTrue(quickUnionWeighted.connected(1, 3));
    }
}