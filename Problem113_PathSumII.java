import java.util.ArrayList;
import java.util.List;

/**
 * 113. Path Sum II
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */
public class Problem113_PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> paths = new ArrayList<>();
        findPaths(root, targetSum, new ArrayList<>(), paths);
        return paths;
    }

    private void findPaths(TreeNode node, int sum, List<Integer> current, List<List<Integer>> paths) {
        if (node == null) return;

        current.add(node.val);
        if (node.left == null && node.right == null && sum == node.val) {
            paths.add(new ArrayList<>(current));
        } else {
            findPaths(node.left, sum - node.val, current, paths);
            findPaths(node.right, sum - node.val, current, paths);
        }
        current.remove(current.size() - 1);
    }
}
