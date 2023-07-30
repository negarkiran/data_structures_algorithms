package leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/minimum-window-substring/
public class MinimumWindowSubString {
    public static String minWindow(String s, String t) {
        if (t.length() == 0) return "";

        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (char c : t.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }

        int have = 0, need = countT.size();
        int left = 0, right;
        int[] result = {-1, -1};
        int resLen = Integer.MAX_VALUE;

        for (right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            window.put(c, window.getOrDefault(c, 0) + 1);

            if (countT.containsKey(c) && window.get(c).equals(countT.get(c))) {
               have++;
            }

            while (have == need) {
                //Update result
                if (right - left + 1 < resLen) {
                    resLen = right - left + 1;
                    result[0] = left;
                    result[1] = right;
                }

                //Pop items from left
                window.put(s.charAt(left), window.get(s.charAt(left)) - 1);
                if (countT.containsKey(s.charAt(left)) && window.get(s.charAt(left)) < countT.get(s.charAt(left))) {
                    have--;
                }
                left++;
            }

        }
        left = result[0];
        right = result[1];

        return resLen < Integer.MAX_VALUE ? s.substring(left, right + 1) : "";

    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
}
