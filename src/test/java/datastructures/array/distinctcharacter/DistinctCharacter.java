package datastructures.array.distinctcharacter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

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
