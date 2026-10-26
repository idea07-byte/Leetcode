import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 71. Simplify Path
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Problem71_SimplifyPath {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(part);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append("/").append(stack.pollLast());
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}
