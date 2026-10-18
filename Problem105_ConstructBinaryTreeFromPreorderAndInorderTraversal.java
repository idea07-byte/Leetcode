public class Problem105_ConstructBinaryTreeFromPreorderAndInorderTraversal {
    int preorderIndex;
    int[] preorder;
    int[] inorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        preorderIndex = 0;

        return build(0, inorder.length - 1);
    }

    private TreeNode build(int left, int right) {
        if (left > right) {
            return null;
        }

        int value = preorder[preorderIndex++];
        TreeNode root = new TreeNode(value);

        int mid = left;

        while (mid <= right && inorder[mid] != value) {
            mid++;
        }

        root.left = build(left, mid - 1);
        root.right = build(mid + 1, right);

        return root;
    }
}
