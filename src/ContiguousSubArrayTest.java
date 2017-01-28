import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by Abuser on 1/27/2017.
 */
public class ContiguousSubArrayTest {

    private static ContiguousSubArray sut;

    @BeforeClass
    public static void init(){
        sut = new ContiguousSubArray();
    }

    @Test
    public void test1(){
        List<Integer> a = new ArrayList<>(asList(1));
        int actual = sut.maxSubArray(a);

        Assert.assertEquals(1, actual);
    }

    @Test
    public void test2(){
        List<Integer> a = new ArrayList<>(asList(1, 2));
        int actual = sut.maxSubArray(a);

        Assert.assertEquals(3, actual);
    }

    @Test
    public void test3(){
        List<Integer> a = new ArrayList<>(asList(1, -1));
        int actual = sut.maxSubArray(a);

        Assert.assertEquals(1, actual);
    }
    @Test
    public void test4(){
        List<Integer> a = new ArrayList<>(asList(-2,1,-3,4,-1,2,1,-5,4));
        int actual = sut.maxSubArray(a);

        Assert.assertEquals(6, actual);
    }


}
