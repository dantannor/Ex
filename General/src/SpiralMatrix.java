import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 12-Jan-17.
 */
public class SpiralMatrix {
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
        ArrayList<Integer> res = new ArrayList<>();

        int m, n;
        int col = 0, row = 0, layer = 0;
        int dir = 0;

        m = a.size();
        n = a.get(0).size();

        for (int i = 0; i < m * n; i++) {
            res.add(a.get(row).get(col));

            switch (dir) {
                case 0:

                    if (col == n - layer - 1) {
                        dir = 1;
                        row++;
                    } else
                        col++;

                    break;
                case 1:

                    if (row == m - layer - 1) {
                        dir = 2;
                        col--;
                    } else
                        row++;

                    break;

                case 2:

                    if (col == layer) {
                        dir = 3;
                        row--;
                    } else
                        col--;

                    break;

                case 3:

                    if (row == layer + 1) {
                        dir = 0;
                        col++;
                        layer++;
                    } else {
                        row--;
                    }
            }
        }

        return res;
    }
}
