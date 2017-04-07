import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Daniel on 07-Apr-17.
 */
public class TwoSum {

    public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> nums = new HashSet<>();
        int minJ = Integer.MAX_VALUE;
        int minI = Integer.MAX_VALUE;
        boolean hit = false;

        if (a.isEmpty())
            return res;

        nums.addAll(a);

        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = i + 1; j < a.size(); j++) {
                boolean condition = a.get(i) + a.get(j) == b;
                boolean firstHit = condition && minJ == Integer.MAX_VALUE;
                boolean lowerJ = condition && j < minJ;
                boolean lowerIandJ = lowerJ && i < minI;

                if (firstHit || lowerJ || lowerIandJ) {
                    hit = true;

                    minJ = j;
                    minI = i;
                }
            }
        }

        if (hit) {
            res.add(minI + 1);
            res.add(minJ + 1);
        }

        return res;
    }
}
