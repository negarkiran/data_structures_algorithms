package algorithms.dynamic_programming;

public class MinimumCostRecursion {

    private int min(int a, int b, int c) {
        if (a < b)
            return Math.min(a, c);
        return Math.min(b, c);
    }

    public int minCost(int[][] cost, int a, int b) {
        if (a < 0 || b < 0)
            return Integer.MAX_VALUE;
        else if (a == 0 && b == 0)
            return cost[a][b];
        else
            return cost[a][b]
                    + min(minCost(cost, a - 1, b - 1),
                    minCost(cost, a - 1, b),
                    minCost(cost, a, b - 1));
    }
}
