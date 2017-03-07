import java.util.HashSet;

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
        HashSet<Integer> set = new HashSet<>();
        int num = a;

        for (int i = 1; i < length(num) + 1; i++) {
            num = a;
            while (num != 0) {
                int cur = (int) Math.pow(10, i);
                int remainder = num % cur;
                int product = product(remainder);

                if (set.contains(product))
                    return 0;

                set.add(product);
                num /= cur;
            }
        }

        return 1;
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
