import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Daniel on 24-Jan-17.
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

        //todo: deal with consecutive equal numbers
        return res;
    }
}
