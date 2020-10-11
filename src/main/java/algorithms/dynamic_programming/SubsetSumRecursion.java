package algorithms.dynamic_programming;

//Given a set of non-negative integers, and a value sum,
// determine if there is a subset of the given set with sum equal to given sum.
public class SubsetSumRecursion {
    public boolean isSubsetAddsToSum(int[] subset, int n, int sum) {
        //Base case
        if (sum == 0) return true;
        if (n == 0) return false;

        if (subset[n - 1] > sum) {
            return isSubsetAddsToSum(subset, n - 1, sum);
        }
        return isSubsetAddsToSum(subset, n - 1, sum)
                || isSubsetAddsToSum(subset, n - 1, sum - subset[n - 1]);
    }
}
