package datastructures.array.distinctcharacter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistinctCharacterTest {
    private DistinctCharacter distinctCharacter;

    @Before
    public void setup() {
        distinctCharacter = new DistinctCharacter();
    }

    @Test
    public void shouldSortBasedOnDistinctCharactersInStringArray() {
        String[] strings = { "Bananas", "do",
                "not", "grow", "in",
                "Mississippi" };

        distinctCharacter.sortArray(strings);
        assertEquals("do", strings[0]);
        assertEquals("grow", strings[5]);
    }

}