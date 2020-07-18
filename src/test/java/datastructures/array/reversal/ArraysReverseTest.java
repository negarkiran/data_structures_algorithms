package datastructures.array.reversal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//Time Complexity : O(n)

public class ArraysReverseTest {

    private ArraysReverse arraysReverse;

    @Before
    public void setup() {
        arraysReverse = new ArraysReverse(6);
    }

    @Test
    public void shouldReverseArray() {
        arraysReverse.add(1);
        arraysReverse.add(2);
        arraysReverse.add(3);
        arraysReverse.add(4);
        arraysReverse.add(5);
        arraysReverse.add(6);

        arraysReverse.reverse();

        assertEquals(6, arraysReverse.getNumbers()[0]);
    }
}