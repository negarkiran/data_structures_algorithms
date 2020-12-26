package algorithms.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromicSubstringTest {

    @Test
    public void shouldFindLongestPalindrome() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        assertEquals("bab", longestPalindromicSubstring.longestPalindrome("babad"));
        assertEquals("", longestPalindromicSubstring.longestPalindrome("asdfgewrewr"));
    }

}