package datastructures.array.longestconsecutivesequence;


import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-consecutive-sequence/
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> numSet = new HashSet<>();
        int length, maxLength = 1;
        for (int num: nums) numSet.add(num);
        for (int num: nums) {
            //Validate if number is beginning of the consecutive sequence by checking availability of previous element in set
            if (!numSet.contains(num - 1)) {
                length = 1;
                while (numSet.contains(num + 1)) {
                    length++;
                    num ++;
                }
                maxLength = Math.max(length, maxLength);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
