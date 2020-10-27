package algorithms.mathematics;

public class CatalanNumbers {
    public static void main(String[] args) {
        for (int i =0; i<10; i++) {
            System.out.print(catalan(i) + " ");
        }
    }

    private static long catalan(int n) {
        long catalan = binomialCoefficient(2 * n, n);

        return catalan/ (n + 1);
    }

    private static long binomialCoefficient(int n, int k) {
        long res = 1;

        // Since C(n, k) = C(n, n-k)
        if (k > n-k) {
            k = n-k;
        }

        // Calculate value of [n*(n-1)*---*(n-k+1)] / [k*(k-1)*---*1]
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
}
