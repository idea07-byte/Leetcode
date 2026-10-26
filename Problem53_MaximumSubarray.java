/**
 * 53. Maximum Subarray (Kadane's Algorithm)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Problem53_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
