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
        arrayRotationUsingExtraVariable.add(1);
        arrayRotationUsingExtraVariable.add(2);
        arrayRotationUsingExtraVariable.add(3);
        arrayRotationUsingExtraVariable.add(4);
        arrayRotationUsingExtraVariable.add(5);

        arrayRotationUsingExtraVariable.rotate(4);

        assertEquals(5, arrayRotationUsingExtraVariable.getRotatedArray()[0]);
    }

}