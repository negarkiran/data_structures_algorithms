package hackerrank.array;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LeftRotation {
    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int size = a.length;
        d = d % size;

        int gcd = gcd(size, d);

        for (int i = 0; i < gcd; i++) {
            int j = i;
            int temp = a[i];
            while (true) {
                int k = j + d;
                if (k >= size) {
                    k = k - size;
                }
                if (k == i) {
                    break;
                }
                a[j] = a[k];
                j = k;
            }
            a[j] = temp;
        }
        return a;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        System.out.println(Arrays.toString(result));

        scanner.close();
    }
}
