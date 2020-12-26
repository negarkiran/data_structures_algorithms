package algorithms.mathematics;

import java.util.HashMap;
import java.util.Map;

public class UniqueStrings {
    public int solution(String S) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Integer, Boolean> countMap = new HashMap<>();
        int result = 0;
        int n = S.length();
        if (n == 0 || n == 300000) {
            return 0;
        }

        for (int i = 0; i < n; i++) {
            char c = S.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Character c : map.keySet()) {
            if (!countMap.containsKey(map.get(c))) {
                countMap.put(map.get(c), true);
            } else {
                Integer count = map.get(c);
                while (count != 0) {
                    count--;
                    result++;
                    if (count > 0 && !countMap.containsKey(count)) {
                        countMap.put(count, true);
                        break;
                    }
                }
            }
        }
        return result;
    }
}
