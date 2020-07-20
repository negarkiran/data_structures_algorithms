package datastructures.array.distinctcharacter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

//Given a string array arr[] as input, the task is to print the words sorted by number of distinct characters that occur in the word, followed by length of word.
//If two words have same number of distinct characters, the word with more total characters comes first.
//If two words have same number of distinct characters and same length, the word that occurs earlier in the sentence must be printed first.

public class DistinctCharacter {
    public int getDistinctCharacterCount(String one) {
        Map<Character, Integer> distinct = new HashMap<>();
        for(char c: one.toCharArray()) {
            if (!distinct.containsKey(c)) {
                distinct.put(c, 1);
            }
        }
        return distinct.size();
    }

    public void sortArray(String[] strings) {
        Arrays.sort(strings, new StringCompare());
    }

    public class StringCompare implements Comparator<String> {

        @Override
        public int compare(String one, String two) {
            if (getDistinctCharacterCount(one) == getDistinctCharacterCount(two)) {
                if (one.length() == two.length()) {
                    return 0;
                }
                if (one.length() > two.length()) {
                    return -1;
                }
                return 1;
            }
            if (getDistinctCharacterCount(one) > getDistinctCharacterCount(two)) {
                return 1;
            }
            return -1;
        }
    }
}
