package algorithms.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PossibleDecodingTest {

    @Test
    public void shouldGetPossibleDecodings() {
        PossibleDecoding possibleDecoding = new PossibleDecoding();
        int possibilities = possibleDecoding.countPossibilities("1111111111".toCharArray());
        assertEquals(89, possibilities);
        possibilities = possibleDecoding.countPossibilities("25114".toCharArray());
        assertEquals(6, possibilities);
    }

}