import java.util.ArrayList;
import java.util.List;

/**
 * 94. Binary Tree Inorder Traversal
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Problem94_BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    private void helper(TreeNode root, List<Integer> result) {
        if (root == null) return;
        helper(root.left, result);
        result.add(root.val);
        helper(root.right, result);
    }
}
