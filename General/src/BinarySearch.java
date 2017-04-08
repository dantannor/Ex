/**
 * Created by Abuser on 1/28/2017.
 */
public class BinarySearch {

    public int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        for (int i = 0; i < a.length / 2 + 1; i++) {
            int cur = (high + low) / 2;

            if (key == a[cur])
                return cur;
            if (a[cur] < key) {
                low = cur + 1;
            } else {
                high = cur - 1;
            }
        }

        return -1;
    }
}
