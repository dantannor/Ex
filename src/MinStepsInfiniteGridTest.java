import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Abuser on 1/13/2017.
 */
public class MinStepsInfiniteGridTest {
    private static MinStepsInfiniteGrid sut;

    @BeforeClass
    public static void Init(){
        sut = new MinStepsInfiniteGrid();
    }
    @Test
    public void Test1(){
        ArrayList<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);

        ArrayList<Integer> y = new ArrayList<>();
        y.add(1);
        y.add(2);
        y.add(3);

        int actual = sut.coverPoints(x, y);

        Assert.assertEquals(2, actual);
    }

    @Test
    public void Test2(){
        ArrayList<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(3);

        ArrayList<Integer> y = new ArrayList<>();
        y.add(-1);
        y.add(3);

        int actual = sut.coverPoints(x, y);

        Assert.assertEquals(4, actual);
    }
}
