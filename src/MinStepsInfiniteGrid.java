import java.util.ArrayList;

/**
 * Created by Abuser on 1/13/2017.
 */
public class MinStepsInfiniteGrid {
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int res = 0;

        for (int i = 0; i < X.size() - 1; i++) {
            int xDiff = Math.abs(X.get(i) - X.get(i+1));
            int yDiff = Math.abs(Y.get(i) - Y.get(i+1));

            res += xDiff > yDiff ?
                    xDiff :
                    yDiff;

        }

        return res;
    }
}
