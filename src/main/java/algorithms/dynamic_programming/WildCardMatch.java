package algorithms.dynamic_programming;

import java.util.Arrays;

public class WildCardMatch {
    public boolean isMatch(String input, String pattern){
        int inputLength = input.length();
        int patternLength = pattern.length();

        //empty pattern can only match with empty string
        if (patternLength == 0) {
            return inputLength == 0;
        }
        boolean[][] lookup = new boolean[inputLength+1][patternLength+1];

        //initialise lookup table to false
        for (int i = 0; i < inputLength + 1; i++) {
            Arrays.fill(lookup[i], false);
        }

        lookup[0][0] = true;

        for (int i = 1; i <= inputLength; i++) {
            for (int j = 1; j <= patternLength; j++) {
                // Two cases if we see a '*'
                // a) We ignore '*'' character and move
                //    to next  character in the pattern,
                //     i.e., '*' indicates an empty
                //     sequence.
                // b) '*' character matches with ith
                //     character in input
                if (pattern.charAt(j-1) == '*'){
                    lookup[i][j] = lookup[i-1][j] || lookup[i][j-1];
                }
                // Current characters are considered as
                // matching in two cases
                // (a) current character of pattern is '?'
                // (b) characters actually match
                else if (pattern.charAt(j-1) == '?'
                || pattern.charAt(j-1) == input.charAt(i-1)) {
                    lookup[i][j] = lookup[i-1][j-1];
                } else {
                    lookup[i][j] = false;
                }
            }
        }
        return lookup[inputLength][patternLength];
    }
}
