package leetcode.slidingwindow;


import java.util.HashSet;
import java.util.Set;

public class LongestRepeatingSubstring {
    public static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int result = 1;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            if (set.contains(s.charAt(right))){
                result = Math.max(result, right - left + 1);
            } else {
                set.add(s.charAt(right));
                while (left < right && s.charAt(left) != s.charAt(right)) {
                    set.remove(s.charAt(left));
                    left++;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abbabbbhhhccdddssd"));
    }
}
