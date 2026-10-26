import java.util.Arrays;

/**
 * 62. Unique Paths
 * Time Complexity: O(m * n)
 * Space Complexity: O(n)
 */
public class Problem62_UniquePaths {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }

        return dp[n - 1];
    }
}
