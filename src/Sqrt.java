/**
 * Created by Daniel on 1/29/2017.
 */
public class Sqrt {
    public int sqrt(int a) {
        int low = 0, high = a / 2;
        int cur = 0;

        if(a == 1)
            return 1;

        while (low < high) {
            cur = (low + high) / 2;
            int mult = cur * cur;

            if (mult == a)
                return cur;

            if (mult > a)
                high = cur - 1;
            else
                low = cur + 1;
        }

        if(low*low > a)
            low-=1;

        return low;
    }
}
