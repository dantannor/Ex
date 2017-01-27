import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by Daniel on 24-Jan-17.
 */
public class WaveArrayTest {
    private static WaveArray sut;

    @BeforeClass
    public static void setup(){
        sut = new WaveArray();
    }

    @Test
    public void test1(){
        ArrayList<Integer> a = new ArrayList<>(asList(1));
        ArrayList<Integer> actual = sut.wave(a);

        Assert.assertEquals(a, actual);
    }

    @Test
    public void test2(){
        ArrayList<Integer> a = new ArrayList<>(asList(1, 2));
        ArrayList<Integer> expected = new ArrayList<>(asList(2, 1));
        ArrayList<Integer> actual = sut.wave(a);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        ArrayList<Integer> a = new ArrayList<>(asList(2, 1));
        ArrayList<Integer> actual = sut.wave(a);

        Assert.assertEquals(a, actual);
    }

    @Test
    public void test4(){
        ArrayList<Integer> a = new ArrayList<>(asList(1, 1, 2));
        ArrayList<Integer> expected = new ArrayList<>(asList(1, 1, 2));
        ArrayList<Integer> actual = sut.wave(a);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        ArrayList<Integer> a = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> expected = new ArrayList<>(asList(2, 1, 3));
        ArrayList<Integer> actual = sut.wave(a);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test6(){
        ArrayList<Integer> a = new ArrayList<>(asList(1, 2, 3, 4));
        ArrayList<Integer> expected = new ArrayList<>(asList(2, 1, 4, 3));
        ArrayList<Integer> actual = sut.wave(a);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test7(){
        ArrayList<Integer> a = new ArrayList<>(asList(2, 1, 6));
        ArrayList<Integer> expected = new ArrayList<>(asList(2, 1, 6));
        ArrayList<Integer> actual = sut.wave(a);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test8(){
        ArrayList<Integer> a = new ArrayList<>(asList(1, 2, 5, 1, 4, 5, 8));
        ArrayList<Integer> expected = new ArrayList<>(asList(1, 1, 4, 2, 5, 5, 8));
        ArrayList<Integer> actual = sut.wave(a);

        Assert.assertEquals(expected, actual);
    }
}
