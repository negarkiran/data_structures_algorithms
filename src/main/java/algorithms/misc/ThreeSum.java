package algorithms.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

// Note: The solution set must not contain duplicate triplets.

// For example, given array S = [-1, 0, 1, 2, -1, -4],

// A solution set is:
// [
//   [-1, 0, 1],
//   [-1, -1, 2]
// ]

public class ThreeSum {
    public List<List<Integer>> threeSum(Integer[] array) {
        Arrays.sort(array);

        List<List<Integer>> list = new ArrayList<>();
        int n = array.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && array[i].equals(array[i - 1])) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;
            int target = -array[i];

            while (j < k) {
                if (array[j] + array[k] == target) { // === (array[j] + array[k] + array[i] == 0)
                    List<Integer> integers = List.of(array[i], array[j], array[k]);
                    list.add(integers);
                    j++;
                    k--;
                    while (j < k && array[j].equals(array[j - 1]))
                        j++;
                    while (j < k && array[k].equals(array[k + 1])){
                        k--;
                    }
                } else if(array[j] + array[k] > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return list;
    }

    public List<List<Integer>> threeSumV1(Integer[] array) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {

            if (i > 0 && array[i] == array[i-1]) continue;

            int left = i + 1, right = array.length - 1;

            while (left<right) {
                if (array[i] + array[left] + array[right] == 0) {
                    result.add(List.of(array[i], array[left], array[right]));
                    left++;
                    right--;

                    while (left < right && array[left] == array[left-1]) left++;
                    while (left < right && array[right] == array[right+1]) right--;
                } else if (array[i] + array[left] + array[right] < 0) {
                    left++;
                } else if (array[i] + array[left] + array[right] > 0) {
                    right--;
                }
            }
        }
        return result;
    }
}
