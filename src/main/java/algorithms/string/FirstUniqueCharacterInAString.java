package algorithms.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    public int firstUniqueChar(String input) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            } else {
                map.put(input.charAt(i), 1);
            }
        }

        for(Character ch : map.keySet()) {
            if (map.get(ch) == 1)
                return input.indexOf(ch);
        }
        return -1;
    }
}
