package hackerrank.warmup;

import java.util.Arrays;

public class ReturnSmallestPositiveInteger {
    public int solution(int[] A) {
        if (A.length == 1) {
            if (A[0] == 1) {
                return 2;
            }
            return 1;
        }
        Arrays.sort(A);
        if (A[0] > 1) {
            return 1;
        }

        for (int i = 0; i < A.length - 1; i++) {
            if (Math.abs(A[i + 1]) - Math.abs(A[i]) > 1) {
                return A[i] + 1;
            }
        }
        int result = A[A.length - 1] == 1000000 ? 1 : A[A.length - 1] + 1;
        return result <= 0 ? 1 : result;
    }
}
