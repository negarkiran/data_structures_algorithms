package hackerrank.warmup;

//John works at a clothing store. He has a large pile of socks that he must pair by color for sale.
// Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
//For example, there are n=7 socks with colors ar={1,2,1,2,1,3,2}. There is one pair of color 1  and one of color 2.
// There are three odd socks left, one of each color. The number of pairs is 2.

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {
    private static final Scanner scanner = new Scanner(System.in);
    private static Map<Integer, Integer> sockPair = new HashMap<>();

    static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        for(Integer key : sockPair.keySet()) {
            pairs = pairs + sockPair.get(key) / 2;
        }
        return pairs;
    }

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
            if (sockPair.containsKey(arItem)) {
                sockPair.put(arItem, sockPair.get(arItem) + 1);
            } else {
                sockPair.put(arItem, 1);
            }

        }
        System.out.println(sockMerchant(n, ar));
        scanner.close();
    }
}
