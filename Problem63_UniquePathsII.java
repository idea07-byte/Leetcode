/**
 * 63. Unique Paths II
 * Time Complexity: O(m * n)
 * Space Complexity: O(n)
 */
public class Problem63_UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int width = obstacleGrid[0].length;
        int[] dp = new int[width];
        dp[0] = 1;

        for (int[] row : obstacleGrid) {
            for (int j = 0; j < width; j++) {
                if (row[j] == 1) {
                    dp[j] = 0;
                } else if (j > 0) {
                    dp[j] += dp[j - 1];
                }
            }
        }

        return dp[width - 1];
    }
}
