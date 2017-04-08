import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;

/**
 * Created by Daniel on 2/5/2017.
 */
public class LongestPrefixTest {
    private static LongestPrefix sut;

    @BeforeClass
    public static void init(){
        sut = new LongestPrefix();
    }

    @Test
    public void test1(){
        ArrayList<String> a = new ArrayList<>(asList("a"));
        String actual = sut.longestCommonPrefix(a);
        Assert.assertEquals("a", actual);
    }

    @Test
    public void test2(){
        ArrayList<String> a = new ArrayList<>(asList("a", "b"));
        String actual = sut.longestCommonPrefix(a);
        Assert.assertEquals("", actual);
    }

    @Test
    public void test3(){
        ArrayList<String> a = new ArrayList<>(asList("a", "ab"));
        String actual = sut.longestCommonPrefix(a);
        Assert.assertEquals("a", actual);
    }

    @Test
    public void test4(){
        ArrayList<String> a = new ArrayList<>(asList("a", "ab", "b"));
        String actual = sut.longestCommonPrefix(a);
        Assert.assertEquals("", actual);
    }
}
