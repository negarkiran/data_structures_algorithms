package algorithms.mathematics;

import java.util.HashMap;
import java.util.Map;

public class NextNumberWithDistinctDigits {
    public static void main(String[] args) {
        int n = 2019;
        System.out.println(nextNumer(n));
    }

    private static int nextNumer(int n) {
        int num = n+1;
        while (!isDistinct(num)) {
            num++;
        }
        return num;
    }

    private static boolean isDistinct(int n) {
        int num  = n;
        Map<Integer, Integer> distinct = new HashMap<>();
        while (num / 10 != 0) {
            int i = num % 10;
            num = num / 10;
            distinct.put(i, distinct.get(i) == null ? 1 : distinct.get(i) + 1);
        }
        distinct.put(num, distinct.get(num) == null ? 1 : distinct.get(num) + 1);
        return distinct.entrySet().stream()
                .noneMatch(item -> item.getValue() > 1);
    }
}
