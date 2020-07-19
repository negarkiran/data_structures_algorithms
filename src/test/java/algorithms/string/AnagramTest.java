package algorithms.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTest {
    private Anagram anagram;

    @Before
    public void setup () {
        anagram = new Anagram();
    }

    @Test
    public void shouldReturnFalseWhenTwoStringsOfDifferentLength() {
        assertFalse(anagram.isAnagram("Hi", "Hello"));
    }

    @Test
    public void shouldReturnTrueWhenTwoStringsAreAnagram() {
        assertTrue(anagram.isAnagram("lolHe", "Hello"));
    }
}