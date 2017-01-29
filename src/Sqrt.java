/**
 * Created by Daniel on 1/29/2017.
 */
public class Sqrt {
    public int sqrt(int a) {
        int low = 0, high = a / 2;
        int res = 0; // not sure this is needed

        while (res <= a) {
            int cur = (low + high) / 2;
            int mult = cur * cur;

            if ((mult) == a)
                return res;

            if (mult > a)
                cur =

            res++;

            //todo: finish implementation with binary search
        }

        return 0;
    }
}
