/**
 * 28. Find the Index of the First Occurrence in a String
 * Time Complexity: O(m * n)
 * Space Complexity: O(1)
 */
public class Problem28_FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int hLen = haystack.length();
        int nLen = needle.length();

        for (int i = 0; i <= hLen - nLen; i++) {
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
