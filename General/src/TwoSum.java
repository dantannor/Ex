import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Daniel on 07-Apr-17.
 */
public class TwoSum {

    public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> neededAmounts = new HashMap<>();
        int minJ = Integer.MAX_VALUE;
        int minI = Integer.MAX_VALUE;
        boolean hit = false;

        if (a.isEmpty())
            return res;

        for (int i = 0; i < a.size(); i++) {
            neededAmounts.put(a.get(i), i);
        }

        for (int i = 0; i < a.size(); i++) {
            int neededAmount = b - a.get(i);
            boolean condition = neededAmounts.containsKey(neededAmount) && neededAmounts.get(neededAmount) > i;
            boolean smallerJ = condition && neededAmounts.get(neededAmount) < minJ;
            boolean smallerIAndJ = smallerJ && i < minI;

            if (condition && minJ == Integer.MAX_VALUE || smallerJ || smallerIAndJ) {
                hit = true;

                minJ = neededAmounts.get(neededAmount);
                minI = i;
            }
        }

        if (hit) {
            res.add(minI + 1);
            res.add(minJ + 1);
        }

        return res;
    }
}
