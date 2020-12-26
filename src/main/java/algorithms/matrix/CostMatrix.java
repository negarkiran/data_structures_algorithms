package algorithms.matrix;

public class CostMatrix {
    public int solution(int[] A) {
        int n = A.length;
        int min = Integer.MAX_VALUE;
        int temp;
        for (int p = 1; p < n; p++) {
            for (int q = p+2; q < n - 1; q++) {
                temp = A[p] + A[q];
                if (min > temp) {
                    min = temp;
                }
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
