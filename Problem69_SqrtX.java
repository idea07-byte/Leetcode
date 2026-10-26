/**
 * 69. Sqrt(x)
 * Time Complexity: O(log x)
 * Space Complexity: O(1)
 */
public class Problem69_SqrtX {
    public int mySqrt(int x) {
        if (x < 2) return x;
        long left = 2, right = x / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long num = mid * mid;
            if (num == x) return (int) mid;
            if (num > x) right = mid - 1;
            else left = mid + 1;
        }

        return (int) right;
    }
}
