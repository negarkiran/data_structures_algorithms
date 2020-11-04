package algorithms.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonSubsequenceTest {
    @Test
    public void shouldFindLongestCommonSubsequence(){
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        assertEquals(4, longestCommonSubsequence.lcs("AGGTAB", "GXTXAYB"));
    }

    @Test
    public void shouldNotFindLongestCommonSubsequence(){
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        assertEquals(0, longestCommonSubsequence.lcs("AGGTAB", "MNDEWQ"));
    }
}