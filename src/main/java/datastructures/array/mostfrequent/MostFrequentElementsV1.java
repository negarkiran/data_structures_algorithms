package datastructures.array.mostfrequent;

import java.util.*;
import java.util.stream.Collectors;

public class MostFrequentElementsV1 {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(Arrays.toString(topKFrequent(nums, 1)));

    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> elements = new HashMap<>();
        for (int num : nums) {
            elements.put(num, elements.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<Integer, Integer> entry : elements.entrySet()) {
            maxHeap.add(entry);
        }

        int[] result = new int[k];
        int counter = 0;
        while (counter < k) {
            result[counter++] = maxHeap.poll().getKey();
        }
        return result;
    }

}
