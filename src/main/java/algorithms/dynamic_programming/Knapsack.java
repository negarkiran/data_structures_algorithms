package algorithms.dynamic_programming;

public class Knapsack {
    private final int[] weight;
    private final int[] value;
    private final Integer[][] cost;

    public Knapsack(int[] weight, int[] value, int c) {
        this.weight = weight;
        this.value = value;
        this.cost = new Integer[weight.length+1][c+1];
    }

    public int findMaximum(int n, int c) {
        int result;
        if (cost[n][c] != null) {
            return cost[n][c];
        }
        else if (n == 0 || c == 0) {
            result = 0;
        } else if (weight[n] > c) {
            result = findMaximum(n - 1, c);
        } else {
            int temp1 = findMaximum(n - 1, c);
            int temp2 = value[n] + findMaximum(n-1, c - weight[n]);
            result = cost[n][c] = Math.max(temp1, temp2);
        }
        return result;
    }
}
