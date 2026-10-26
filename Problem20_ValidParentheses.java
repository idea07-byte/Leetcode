import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 20. Valid Parentheses
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Problem20_ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
}
