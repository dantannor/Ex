import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by Daniel on 07-Apr-17.
 */
public class TwoSumTests {

    private static TwoSum sut;

    @BeforeClass
    public static void setup(){
        sut = new TwoSum();
    }

    @Test
    public void test1(){
        List<Integer> a = new ArrayList<>(asList(1, 2, 3));
        int b = 3;
        ArrayList<Integer> expected = new ArrayList<>(asList(1, 2));
        ArrayList<Integer> actual = sut.twoSum(a, b);

        Assert.assertEquals(expected, actual);

    }
}
