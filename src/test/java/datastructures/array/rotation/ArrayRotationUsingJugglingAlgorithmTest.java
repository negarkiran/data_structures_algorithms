package datastructures.array.rotation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayRotationUsingJugglingAlgorithmTest {

    private ArrayRotationUsingJugglingAlgorithm arrayRotationUsingJugglingAlgorithm;

    @Before
    public void setup() {
        arrayRotationUsingJugglingAlgorithm = new ArrayRotationUsingJugglingAlgorithm(12);
    }

    @Test
    public void shouldRotateArrayBySpecifiedNumber() {
        arrayRotationUsingJugglingAlgorithm.add(1);
        arrayRotationUsingJugglingAlgorithm.add(2);
        arrayRotationUsingJugglingAlgorithm.add(3);
        arrayRotationUsingJugglingAlgorithm.add(4);
        arrayRotationUsingJugglingAlgorithm.add(5);
        arrayRotationUsingJugglingAlgorithm.add(6);
        arrayRotationUsingJugglingAlgorithm.add(7);
        arrayRotationUsingJugglingAlgorithm.add(8);
        arrayRotationUsingJugglingAlgorithm.add(9);
        arrayRotationUsingJugglingAlgorithm.add(10);
        arrayRotationUsingJugglingAlgorithm.add(11);
        arrayRotationUsingJugglingAlgorithm.add(12);

        arrayRotationUsingJugglingAlgorithm.rotateLeft(4);

        assertEquals(5, arrayRotationUsingJugglingAlgorithm.getNumbers()[0]);
    }
}