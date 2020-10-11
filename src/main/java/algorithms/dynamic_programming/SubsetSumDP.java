package algorithms.dynamic_programming;

//Given a set of non-negative integers, and a value sum,
// determine if there is a subset of the given set with sum equal to given sum.
public class SubsetSumDP {
    public boolean isSubsetAddsToSum(int[] set, int n, int sum) {

        boolean[][] subset = new boolean[sum + 1][n + 1];

        // If sum is 0, then answer is true
        for (int i = 0; i <= n; i++) {
            subset[0][i] = true;
        }

        // If sum is not 0, then set is empty
        for (int i = 1; i <= sum; i++) {
            subset[i][0] = false;
        }

        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                subset[i][j] = subset[i][j - 1];
                if (i >= set[j - 1]) {
                    subset[i][j] = subset[i][j]
                            || subset[i - set[j - 1]][j - 1];
                }
            }
        }
        return subset[sum][n];
    }
}
