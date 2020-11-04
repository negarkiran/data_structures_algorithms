package algorithms.dynamic_programming;

import org.junit.Test;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WildCardMatchTest {

    @Test
    public void shouldMatchPattern() {
        WildCardMatch wildCardMatch = new WildCardMatch();
        assertTrue(wildCardMatch.isMatch("aaabbbccccc", "a*b*c"));
    }

    @Test
    public void shouldNotMatchPattern() {
        WildCardMatch wildCardMatch = new WildCardMatch();
        assertFalse(wildCardMatch.isMatch("aaabbbbccc", "a?b*c"));
    }
}