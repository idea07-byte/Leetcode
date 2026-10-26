import java.util.ArrayList;
import java.util.List;

/**
 * 46. Permutations
 * Time Complexity: O(n * n!)
 * Space Complexity: O(n)
 */
public class Problem46_Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] nums, boolean[] used) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            current.add(nums[i]);
            backtrack(result, current, nums, used);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}
