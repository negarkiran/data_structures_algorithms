package datastructures.array.arrangement;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoveZerosToEndTest {

    @Test
    public void shouldMoveAllZerosToEnd() {
        int[] array = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        MoveZerosToEnd moveZerosToEnd = new MoveZerosToEnd();
        moveZerosToEnd.move(array, 11);
        assertEquals(0, array[10]);
    }

}