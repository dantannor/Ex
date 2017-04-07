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
        List<Integer> nums = getSubNums(str);

        for (int num: nums) {
            int product = product(num);

            if(curNums.contains(product))
                return 0;

            curNums.add(product);
        }

        return 1;
    }

    private List<Integer> getSubNums(String str) {
        List<Integer> res = new ArrayList<>();
        for (int c = 0; c < str.length(); c++) {
            for (int i = 1; i <= str.length(); i++) {
                if(c+i <= str.length()){
                    String sub = str.substring(c, c + i);
                    int num = Integer.parseInt(sub);
                    res.add(num);
                }
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
}
