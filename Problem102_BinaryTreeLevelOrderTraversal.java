import java.util.ArrayList;
import java.util.List;

public class Problem102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        TreeNode[] queue = new TreeNode[10000];
        int front = 0;
        int rear = 0;

        queue[rear++] = root;

        while (front < rear) {
            int size = rear - front;
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue[front++];
                level.add(node.val);

                if (node.left != null) {
                    queue[rear++] = node.left;
                }

                if (node.right != null) {
                    queue[rear++] = node.right;
                }
            }

            result.add(level);
        }

        return result;
    }
}
