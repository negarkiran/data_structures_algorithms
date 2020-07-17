package datastructures.array.rotation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayRotationUsingJugglingAlgorithmTest {

    private ArrayRotationUsingJugglingAlgorithm arrayRotationUsingJugglingAlgorithm;

    @Before
    public void setup() {
        arrayRotationUsingJugglingAlgorithm = new ArrayRotationUsingJugglingAlgorithm(5);
    }

    @Test
    public void shouldRotateArrayBySpecifiedNumber() {
        arrayRotationUsingJugglingAlgorithm.add(1);
        arrayRotationUsingJugglingAlgorithm.add(2);
        arrayRotationUsingJugglingAlgorithm.add(3);
        arrayRotationUsingJugglingAlgorithm.add(4);
        arrayRotationUsingJugglingAlgorithm.add(5);

        arrayRotationUsingJugglingAlgorithm.rotateLeft(4);

        assertEquals(5, arrayRotationUsingJugglingAlgorithm.getNumbers()[0]);
    }
}