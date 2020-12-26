package datastructures.array.rotation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayRotationUsingExtraArrayTest {
    private ArrayRotationUsingExtraArray arrayRotationUsingExtraArray;

    @Test
    public void shouldRotateArrayBySpecifiedNumber() {
        arrayRotationUsingExtraArray = new ArrayRotationUsingExtraArray(5);
        arrayRotationUsingExtraArray.add(3);
        arrayRotationUsingExtraArray.add(8);
        arrayRotationUsingExtraArray.add(9);
        arrayRotationUsingExtraArray.add(7);
        arrayRotationUsingExtraArray.add(6);

        arrayRotationUsingExtraArray.rotate(3);

        assertEquals(3, arrayRotationUsingExtraArray.getShifted()[2]);
    }

    @Test
    public void shouldRotateArrayBySpecifiedNumberCaseTwo() {
        arrayRotationUsingExtraArray = new ArrayRotationUsingExtraArray(4);
        arrayRotationUsingExtraArray.add(1);
        arrayRotationUsingExtraArray.add(2);
        arrayRotationUsingExtraArray.add(3);
        arrayRotationUsingExtraArray.add(4);

        arrayRotationUsingExtraArray.rotate(3);

        assertEquals(2, arrayRotationUsingExtraArray.getShifted()[2]);
    }
}