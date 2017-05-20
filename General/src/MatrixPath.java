import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Find if there's a path of 1s between two given points in a matrix
 */
public class MatrixPath {
    public boolean pathExists(int[] start, int[] end, int[][] mat) {
        if (!validIndex(start, mat))
            return false;

        if(passedEnd(start, end))
            return false;

        if (mat[start[0]][start[1]] == 0)
            return false;

        if (Arrays.equals(start, end))
            return true;

        return pathExists(new int[]{start[0] + 1, start[1]}, end, mat)
                || pathExists(new int[]{start[0], start[1] + 1}, end, mat);
    }

    private boolean passedEnd(int[] start, int[] end) {
        if(start[0] > end[0] || start[1] > end[1])
            return true;

        return false;
    }

    private boolean validIndex(int[] start, int[][] mat) {
        if (start[0] > mat.length - 1 || start[1] > mat[0].length
                || start[0] < 0
                || start[1] < 0)
            return false;

        return true;
    }
}
