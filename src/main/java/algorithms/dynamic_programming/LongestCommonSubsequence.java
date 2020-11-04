package algorithms.dynamic_programming;

public class LongestCommonSubsequence {
    public int lcs(String first, String second) {
        int m = first.length();
        int n = second.length();
        int[][] L = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if (first.charAt(i - 1) == second.charAt(j - 1)) {
                    L[i][j] = 1 + L[i - 1][j - 1];
                } else {
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }
        return L[m][n];
    }
}
