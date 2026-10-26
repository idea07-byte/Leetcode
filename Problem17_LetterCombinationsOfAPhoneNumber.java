import java.util.ArrayList;
import java.util.List;

/**
 * 17. Letter Combinations of a Phone Number
 * Time Complexity: O(4^n)
 * Space Complexity: O(n)
 */
public class Problem17_LetterCombinationsOfAPhoneNumber {
    private static final String[] MAPPING = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return result;
        backtrack(result, digits, new StringBuilder(), 0);
        return result;
    }

    private void backtrack(List<String> result, String digits, StringBuilder current, int index) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = MAPPING[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(result, digits, current, index + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
