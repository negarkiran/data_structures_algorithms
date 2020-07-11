package algorithms.dynamic_connectivity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuickUnionWeightedPathCompressionTest {
    private QuickUnionWeightedPathCompression quickUnionWeightedPathCompression;

    @Before
    public void setup(){
        quickUnionWeightedPathCompression =
                new QuickUnionWeightedPathCompression(10);
    }

    @Test
    public void shouldFindIfTwoNodesAreConnected() {
        quickUnionWeightedPathCompression.union(0, 5);
        quickUnionWeightedPathCompression.union(5, 6);

        quickUnionWeightedPathCompression.union(2, 7);

        quickUnionWeightedPathCompression.union(3, 8);
        quickUnionWeightedPathCompression.union(8, 9);
        quickUnionWeightedPathCompression.union(9, 4);

        assertFalse(quickUnionWeightedPathCompression.connected(1, 2));
        assertTrue(quickUnionWeightedPathCompression.connected(3, 4));
    }
}