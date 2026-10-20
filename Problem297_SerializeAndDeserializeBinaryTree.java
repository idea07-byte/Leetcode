public class Problem297_SerializeAndDeserializeBinaryTree {
    int index;

    public String serialize(TreeNode root) {
        if (root == null) {
            return "N,";
        }

        return root.val + ","
            + serialize(root.left)
            + serialize(root.right);
    }

    public TreeNode deserialize(String data) {
        char[] chars = data.toCharArray();
        index = 0;

        return build(chars);
    }

    private TreeNode build(char[] chars) {
        if (index >= chars.length) {
            return null;
        }

        if (chars[index] == 'N') {
            while (index < chars.length && chars[index] != ',') {
                index++;
            }

            if (index < chars.length) {
                index++;
            }

            return null;
        }

        int sign = 1;

        if (chars[index] == '-') {
            sign = -1;
            index++;
        }

        int value = 0;

        while (index < chars.length
                && chars[index] != ',') {
            value = value * 10 + (chars[index] - '0');
            index++;
        }

        if (index < chars.length) {
            index++;
        }

        value *= sign;

        TreeNode root = new TreeNode(value);

        root.left = build(chars);
        root.right = build(chars);

        return root;
    }
}
