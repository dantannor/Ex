import java.util.ArrayList;

/**
 * Created by Daniel on 24-Jan-17.
 */
public class WaveArray {
    public ArrayList<Integer> wave(ArrayList<Integer> a) {
        if (a.size() == 1 || a.isEmpty())
            return a;
        ArrayList<Integer> res = (ArrayList<Integer>) a.clone();

        if (a.get(0) > a.get(1)) {
            int tmp = res.get(0);
            res.set(0, res.get(1));
            res.set(1, tmp);
        }

        // todo: first sort from small to large, then some type of bubble sort. also, what if there's no answer?


        return res;
    }
}
