package leetcode.slidingwindow;


import java.util.HashSet;
import java.util.Set;

public class LongestRepeatingSubstringV1 {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0, left = 0, right = 0;
        while (left <= right && right < s.length() - 1) {
            if (s.charAt(left) == s.charAt(right)) {
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                left = right;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abbabbbhhhccdddssd"));
    }
}
