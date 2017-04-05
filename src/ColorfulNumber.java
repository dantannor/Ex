import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * For Given Number N find if its COLORFUL number or not
 * <p>
 * Return 0/1
 * <p>
 * COLORFUL number:
 * <p>
 * A number can be broken into different contiguous sub-subsequence parts.
 * Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245.
 * And this number is a COLORFUL number, since product of every digit of a contiguous subsequence is different
 */
public class ColorfulNumber {
    public int colorful(int a) {
        String str = String.valueOf(a);
        HashSet<Integer> curNums = new HashSet<>();
        List nums = getSubNums(str);

        for (num: nums) {
            product(num);
        }
    }

    private List getSubNums(String str) {
        List res = new ArrayList<>();
        for (int c = 0; c < str.length(); c++) {
            for (int i = 1; i < str.length(); i++) {
                String sub = str.substring(c, c + i);
                int num = Integer.parseInt(sub);
                res.add(num);
            }
        }

        return res;
    }

    private Integer product(int a) {
        int num = a;
        int product = 1;

        if (a == 0)
            return 0;

        while (num != 0) {
            product *= num % 10;
            num /= 10;
        }

        return product;
    }

    private int length(int a) {
        int num = a;
        int count = 0;

        if (a == 0)
            return 1;

        while (num != 0) {
            num /= 10;
            count++;
        }

        return count;
    }
}
