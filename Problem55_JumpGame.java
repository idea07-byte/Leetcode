/**
 * 55. Jump Game
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Problem55_JumpGame {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}
