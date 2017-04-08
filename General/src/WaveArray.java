import java.util.ArrayList;
import java.util.Comparator;

/**
 * Given an array of integers, sort the array into a wave like array and return it,
 In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....
 */
public class WaveArray {
    public ArrayList<Integer> wave(ArrayList<Integer> a) {
        if (a.size() == 1 || a.isEmpty())
            return a;
        ArrayList<Integer> res = (ArrayList<Integer>) a.clone();
        res.sort(Comparator.naturalOrder());

        for (int i = 0; i < a.size() - 1; i+=2) {
            int tmp = res.get(i);
            res.set(i, res.get(i+1));
            res.set(i+1, tmp);
        }

        return res;
    }
}
