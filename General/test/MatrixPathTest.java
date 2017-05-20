import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by Daniel on 20-May-17.
 */
public class MatrixPathTest {
    private static MatrixPath sut;

    @BeforeClass
    public static void init(){
        sut = new MatrixPath();
    }

    @Test
    public void test1(){
        int[][] mat = new int[][]{
                {0, 0, 1},
                {0, 0, 1},
                {0, 0, 1},
        } ;

        boolean actual = sut.pathExists(new int[]{0, 0}, new int[]{1, 1}, mat);

        Assert.assertEquals(false, actual);
    }

    @Test
    public void test2(){
        int[][] mat = new int[][]{
                {0, 0, 1},
                {0, 0, 1},
                {0, 0, 1},
        } ;

        boolean actual = sut.pathExists(new int[]{0, 2}, new int[]{2, 2}, mat);

        Assert.assertEquals(true, actual);
    }

    @Test
    public void test3(){
        int[][] mat = new int[][]{
                {1, 1, 1},
                {0, 0, 1},
                {0, 0, 1},
        } ;

        boolean actual = sut.pathExists(new int[]{0, 0}, new int[]{2, 2}, mat);

        Assert.assertEquals(true, actual);
    }
    @Test
    public void test4(){
        int[][] mat = new int[][]{
                {1, 1, 1},
                {0, 0, 1},
                {0, 0, 1},
        } ;

        boolean actual = sut.pathExists(new int[]{0, 1}, new int[]{2, 2}, mat);

        Assert.assertEquals(true, actual);
    }

    @Test
    public void test5(){
        int[][] mat = new int[][]{
                {1, 1, 1},
                {0, 0, 1},
                {0, 0, 1},
        } ;

        boolean actual = sut.pathExists(new int[]{1, 0}, new int[]{2, 2}, mat);

        Assert.assertEquals(false, actual);
    }
}

