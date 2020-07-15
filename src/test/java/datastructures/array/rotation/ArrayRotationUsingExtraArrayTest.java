package datastructures.array.rotation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayRotationUsingExtraArrayTest {
    private ArrayRotationUsingExtraArray arrayRotationUsingExtraArray;

    @Before
    public void setup() {
        arrayRotationUsingExtraArray = new ArrayRotationUsingExtraArray(5);
    }

    @Test
    public void shouldRotateArrayBySpecifiedNumber() {
        arrayRotationUsingExtraArray.add(1);
        arrayRotationUsingExtraArray.add(2);
        arrayRotationUsingExtraArray.add(3);
        arrayRotationUsingExtraArray.add(4);
        arrayRotationUsingExtraArray.add(5);

        arrayRotationUsingExtraArray.rotate(4);

        assertEquals(5, arrayRotationUsingExtraArray.getShifted()[0]);
    }
}