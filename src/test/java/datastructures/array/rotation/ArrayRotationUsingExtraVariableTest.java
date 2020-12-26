package datastructures.array.rotation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayRotationUsingExtraVariableTest {

    private ArrayRotationUsingExtraVariable arrayRotationUsingExtraVariable;

    @Before
    public void setup() {
        arrayRotationUsingExtraVariable = new ArrayRotationUsingExtraVariable(5);
    }

    @Test
    public void shouldRotateArrayBySpecifiedNumber() {
        arrayRotationUsingExtraVariable.add(3);
        arrayRotationUsingExtraVariable.add(8);
        arrayRotationUsingExtraVariable.add(9);
        arrayRotationUsingExtraVariable.add(7);
        arrayRotationUsingExtraVariable.add(6);

        arrayRotationUsingExtraVariable.rotate(3);

        assertEquals(5, arrayRotationUsingExtraVariable.getRotatedArray()[0]);
    }

}