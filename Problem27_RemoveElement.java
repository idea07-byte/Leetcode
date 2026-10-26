/**
 * 27. Remove Element
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Problem27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
