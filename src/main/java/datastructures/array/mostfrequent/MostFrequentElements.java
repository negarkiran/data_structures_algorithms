package datastructures.array.mostfrequent;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(Arrays.toString(topKFrequent(nums, 1)));

    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> elements = new HashMap<>();
        for (int num : nums) {
            elements.put(num, elements.getOrDefault(num, 0) + 1);
        }

        List<Integer> sortedList = elements.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry<Integer, Integer>::getValue).reversed())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return sortedList.subList(0, k).stream().mapToInt(Integer::intValue).toArray();
    }

}
