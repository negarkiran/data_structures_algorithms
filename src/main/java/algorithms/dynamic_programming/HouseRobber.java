package algorithms.dynamic_programming;

// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

// Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

public class HouseRobber {
    public int rob(int[] cash) {
        if (cash.length == 0)
            return 0;
        if (cash.length == 1)
            return cash[0];

        int[] dp = new int[cash.length];

        dp[0] = cash[0];
        dp[1] = Math.max(cash[0], cash[1]);

        for (int i = 2; i< cash.length; i++) {
            dp[i] = Math.max(dp[i-2] + cash[i], dp[i-1]);
        }

        return dp[cash.length-1];
    }

    public int robWithoutSpace(int[] cash) {
        int n = cash.length;
        if (n == 0)
            return 0;

        int value1 = cash[0];

        if (n == 1)
            return value1;

        int value2 = Math.max(cash[0], cash[1]);

        if (n==2)
            return value2;

        int maxValue = 0;
        for (int i = 2; i< n; i++) {
            maxValue = Math.max(value1 + cash[i], value2);
            value1 = value2;
            value2 = maxValue;
        }
        return maxValue;
    }
}
