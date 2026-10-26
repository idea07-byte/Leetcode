/**
 * 91. Decode Ways
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Problem91_DecodeWays {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') return 0;

        int prev2 = 1;
        int prev1 = 1;

        for (int i = 1; i < s.length(); i++) {
            int current = 0;
            int singleDigit = s.charAt(i) - '0';
            int twoDigit = Integer.parseInt(s.substring(i - 1, i + 1));

            if (singleDigit >= 1) current += prev1;
            if (twoDigit >= 10 && twoDigit <= 26) current += prev2;

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}
