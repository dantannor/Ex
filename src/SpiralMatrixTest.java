
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by Daniel on 12-Jan-17.
 */
public class SpiralMatrixTest {

    private static SpiralMatrix sut;

    @BeforeClass
    public static void setup(){
        sut = new SpiralMatrix();
    }

    @Test
    public void test(){
        ArrayList<Integer> r1 = new ArrayList<>(asList(1, 2));
        ArrayList<Integer> r2 = new ArrayList<>(asList(4, 3));

        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(r1);
        mat.add(r2);

        ArrayList<Integer> integers = sut.spiralOrder(mat);
        List<Integer> actual =integers;

        Assert.assertEquals(asList(1, 2, 3, 4), actual);
    }

    @Test
    public void test2(){
        ArrayList<Integer> r1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> r2 = new ArrayList<>(asList(8, 9, 4));
        ArrayList<Integer> r3 = new ArrayList<>(asList(7, 6, 5));


        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(r1);
        mat.add(r2);
        mat.add(r3);

        ArrayList<Integer> integers = sut.spiralOrder(mat);
        List<Integer> actual =integers;

        Assert.assertEquals(asList(1, 2, 3, 4, 5, 6, 7, 8, 9), actual);
    }

    @Test
    public void test3(){
        ArrayList<Integer> r1 = new ArrayList<>(asList(1));



        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(r1);

        ArrayList<Integer> integers = sut.spiralOrder(mat);
        List<Integer> actual =integers;

        Assert.assertEquals(asList(1), actual);
    }

    @Test
    public void test4(){
        ArrayList<Integer> r1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> r2 = new ArrayList<>(asList(6, 5, 4));

        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(r1);
        mat.add(r2);

        ArrayList<Integer> integers = sut.spiralOrder(mat);
        List<Integer> actual =integers;

        Assert.assertEquals(asList(1, 2, 3, 4, 5, 6), actual);
    }

    @Test
    public void test5(){
        ArrayList<Integer> r1 = new ArrayList<>(asList(1, 2, 3));

        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(r1);

        ArrayList<Integer> integers = sut.spiralOrder(mat);
        List<Integer> actual =integers;

        Assert.assertEquals(asList(1, 2, 3), actual);
    }

    @Test
    public void test6(){
        ArrayList<Integer> r1 = new ArrayList<>(asList(1));
        ArrayList<Integer> r2 = new ArrayList<>(asList(2));
        ArrayList<Integer> r3 = new ArrayList<>(asList(3));


        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(r1);
        mat.add(r2);
        mat.add(r3);

        ArrayList<Integer> integers = sut.spiralOrder(mat);
        List<Integer> actual =integers;

        Assert.assertEquals(asList(1, 2, 3), actual);
    }
}
