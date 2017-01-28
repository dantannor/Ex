import java.util.Collections;
import java.util.List;

/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * <p>
 * For example:
 * <p>
 * Given the array [-2,1,-3,4,-1,2,1,-5,4],
 * <p>
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * <p>
 * For this problem, return the maximum sum.
 */
public class ContiguousSubArray {
    public int maxSubArray(final List<Integer> a) {
        int sum = a.get(0);
        int max = a.get(0);

        for (int i = 1; i < a.size(); i++) {
            sum = Math.max(sum + a.get(i), a.get(i));
            max = Math.max(max, sum);
        }

        return max;
    }
}
