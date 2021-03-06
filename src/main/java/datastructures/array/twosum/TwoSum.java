package datastructures.array.twosum;

import java.util.HashMap;
import java.util.Map;

//Time complexity : O(n)O(n). We traverse the list containing nn elements only once. Each look up in the table costs only O(1)O(1) time.
//Space complexity : O(n)O(n). The extra space required depends on the number of items stored in the hash table, which stores at most nn elements.

public class TwoSum {
    public int[] twoSum(int[] array, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int complement = sum - array[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(array[i], i);
        }
        throw new IllegalArgumentException("No two numbers found");
    }
}
