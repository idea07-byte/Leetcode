/**
 * 136. Single Number
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Problem136_SingleNumber {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
