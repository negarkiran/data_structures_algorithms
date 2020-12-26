package algorithms.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstUniqueCharacterInAStringTest {

    @Test
    public void shouldFindUniqueCharacterIndex() {
        FirstUniqueCharacterInAString firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();
        assertEquals(0, firstUniqueCharacterInAString.firstUniqueChar("leetcode"));
        assertEquals(-1, firstUniqueCharacterInAString.firstUniqueChar("lleettccooddee"));
    }

}