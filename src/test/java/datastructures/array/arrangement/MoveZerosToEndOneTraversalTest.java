package datastructures.array.arrangement;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoveZerosToEndOneTraversalTest {

    @Test
    public void shouldMoveAllZerosToEnd() {
        MoveZerosToEndOneTraversal moveZerosToEndOneTraversal = new MoveZerosToEndOneTraversal();
        int[] array = {1, 2, 0, 0, 0, 3, 6};
        moveZerosToEndOneTraversal.move(array, 7);
        assertEquals(0, array[6]);
        assertEquals(6, array[3]);
    }

}