import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 56. Merge Intervals
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */
public class Problem56_MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();

        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        for (int[] interval : intervals) {
            if (interval[0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);
            } else {
                currentInterval = interval;
                result.add(currentInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
