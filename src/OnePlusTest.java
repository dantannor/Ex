import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class OnePlusTest{
    private static OnePlus sut;

    @BeforeClass
    public static void init(){
        sut = new OnePlus();
    }

    @Test
    public void test(){
        ArrayList a = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> actual = sut.plusOne(a);

        ArrayList<Integer> expected = new ArrayList<>(asList(1, 2, 4));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        ArrayList a = new ArrayList<>(asList(1, 2, 9));
        ArrayList<Integer> actual = sut.plusOne(a);

        ArrayList<Integer> expected = new ArrayList<>(asList(1, 3, 0));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        ArrayList a = new ArrayList<>(asList(9));
        ArrayList<Integer> actual = sut.plusOne(a);

        ArrayList<Integer> expected = new ArrayList<>(asList(1, 0));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        ArrayList a = new ArrayList<>(asList(9, 9));
        ArrayList<Integer> actual = sut.plusOne(a);

        ArrayList<Integer> expected = new ArrayList<>(asList(1, 0, 0));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        ArrayList a = new ArrayList<>(asList(2, 0, 9, 9));
        ArrayList<Integer> actual = sut.plusOne(a);

        ArrayList<Integer> expected = new ArrayList<>(asList(2, 1, 0, 0));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test6(){
        ArrayList a = new ArrayList<>(asList(2, 5, 6, 8, 6, 1, 2, 4, 5));
        ArrayList<Integer> actual = sut.plusOne(a);

        ArrayList<Integer> expected = new ArrayList<>(asList(2, 5, 6, 8, 6, 1, 2, 4, 6));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test7(){
        ArrayList a = new ArrayList<>(asList(6, 4, 7, 7, 8, 9));
        ArrayList<Integer> actual = sut.plusOne(a);

        ArrayList<Integer> expected = new ArrayList<>(asList(6, 4, 7, 7, 9, 0));
        Assert.assertEquals(expected, actual);
    }
}
