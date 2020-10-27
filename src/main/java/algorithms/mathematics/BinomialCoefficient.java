package algorithms.mathematics;

public class BinomialCoefficient {
    public long binomialCoefficient(int n, int k) {
        long result = 1;
        //C(n,k) = C(n, n-k)
        if (k > n - k) {
            k = n - k;
        }

        for (int i = 0; i < k; ++i) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}
