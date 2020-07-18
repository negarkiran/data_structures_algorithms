package datastructures.array.reversal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysReverseRecursionTest {

    private ArraysReverseRecursion arraysReverseRecursion;

    @Before
    public void setup() {
        arraysReverseRecursion = new ArraysReverseRecursion(6);
    }

    @Test
    public void shouldReverseArray() {
        arraysReverseRecursion.add(1);
        arraysReverseRecursion.add(2);
        arraysReverseRecursion.add(3);
        arraysReverseRecursion.add(4);
        arraysReverseRecursion.add(5);
        arraysReverseRecursion.add(6);

        arraysReverseRecursion.reverse(0, 5);

        assertEquals(6, arraysReverseRecursion.getNumbers()[0]);
    }
}