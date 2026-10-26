/**
 * 111. Minimum Depth of Binary Tree
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Problem111_MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) return minDepth(root.right) + 1;
        if (root.right == null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
