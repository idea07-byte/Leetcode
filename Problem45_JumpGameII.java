/**
 * 45. Jump Game II
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Problem45_JumpGameII {
    public int jump(int[] nums) {
        int jumps = 0, currentEnd = 0, farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }
}
