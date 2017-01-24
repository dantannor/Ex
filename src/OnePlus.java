import java.util.ArrayList;

/**
 * Created by Abuser on 1/13/2017.
 */
public class OnePlus {
    public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        if (a.size() > 1)
            removeZeroes(a);

        if (a.get(a.size() - 1) != 9) {
            a.set(a.size() - 1, a.get(a.size() - 1) + 1);
            return a;
        }
        int i = a.size() - 1;
        while (i >= 0 && a.get(i) == 9) {
            if (i == 0) {
                a.set(i, 0);
                a.add(0, 1);
            } else {
                if (a.get(i - 1) != 9) {
                    a.set(i, 0);
                    a.set(i - 1, a.get(i - 1) + 1);

                    break;
                } else {
                    a.set(i, 0);
                }
            }
            i--;
        }

        return a;
    }

    private void removeZeroes(ArrayList<Integer> a) {
        while (a.get(0) == 0) {
            a.remove(0);
        }
    }

}
