package datastructures.array.rotation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayRotationUsingExtraSpaceTest {

    private ArrayRotationUsingExtraSpace arrayRotationUsingExtraSpace;

    @Before
    public void setup() {
        arrayRotationUsingExtraSpace = new ArrayRotationUsingExtraSpace(5);
    }

    @Test
    public void shouldRotateArrayBySpecifiedNumber() {
        arrayRotationUsingExtraSpace.add(1);
        arrayRotationUsingExtraSpace.add(2);
        arrayRotationUsingExtraSpace.add(3);
        arrayRotationUsingExtraSpace.add(4);
        arrayRotationUsingExtraSpace.add(5);

        arrayRotationUsingExtraSpace.rotate(4);

        assertEquals(5, arrayRotationUsingExtraSpace.getRotatedArray()[0]);
    }

}