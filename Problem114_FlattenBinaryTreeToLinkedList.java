/**
 * 114. Flatten Binary Tree to Linked List
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Problem114_FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode prev = curr.left;
                while (prev.right != null) {
                    prev = prev.right;
                }
                prev.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
}
