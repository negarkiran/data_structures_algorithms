package algorithms.mathematics;

/*
* Given an array where every element occurs three times, except one element which occurs only once.
* Find the element that occurs once. Expected time complexity is O(n) and O(1) extra space.
* */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class ElementThatAppearsOnce {
    public static void main(String[] args) {
        int[] input = {1,1,1,2};
        getUniqueElementUsingMap(input);

        getUniqueElementUsingSet(input);

        getUniqueElementUsingBitWise(input);
    }

    private static void getUniqueElementUsingBitWise(int[] input) {
        int ones = 0, twos = 0;
        int common_bit_mask;
        int n = input.length;
        for(int i=0; i<n; i++ )
        {
            /*"one & arr[i]" gives the bits that are there in
            both 'ones' and new element from arr[]. We
            add these bits to 'twos' using bitwise OR*/
            twos = twos | (ones & input[i]);

            /*"one & arr[i]" gives the bits that are
            there in both 'ones' and new element from arr[].
            We add these bits to 'twos' using bitwise XOR*/
            ones = ones ^ input[i];

            /* The common bits are those bits which appear third time
            So these bits should not be there in both 'ones' and 'twos'.
            common_bit_mask contains all these bits as 0, so that the bits can
            be removed from 'ones' and 'twos'*/
            common_bit_mask = ~(ones & twos);

            /*Remove common bits (the bits that appear third time) from 'ones'*/
            ones &= common_bit_mask;

            /*Remove common bits (the bits that appear third time) from 'twos'*/
            twos &= common_bit_mask;
        }
        System.out.println(ones);
    }

    private static void getUniqueElementUsingSet(int[] input) {
        Set<Integer> numbers = new HashSet<>();
        int arraySum = 0;
        int setSum = 0;
        for (int i : input) {
            arraySum += i;
            boolean isAdded = numbers.add(i);
            if (isAdded) {
                setSum += i;
            }
        }
        System.out.println((3 * setSum - arraySum) /2);
    }

    private static void getUniqueElementUsingMap(int[] input) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : input) {
            map.put(i, map.get(i) == null ? 1 : map.get(i)+1);
        }

        Optional<Map.Entry<Integer, Integer>> distinct = map.entrySet().stream()
                .filter(a -> a.getValue() == 1)
                .findFirst();
        if (distinct.isPresent()) {
            System.out.println(distinct.get().getKey());
        } else {
            System.out.println("No item is unique");
        }
    }
}
