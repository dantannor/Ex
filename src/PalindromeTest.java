import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Daniel on 2/5/2017.
 */
public class PalindromeTest {
    private static Palindrome sut;

    @BeforeClass
    public static void init(){
        sut = new Palindrome();
    }

    @Test
    public void test1(){
        String s = "";
        boolean actual = sut.palindrome(s);
        Assert.assertEquals(true, actual);
    }

    @Test
    public void test2(){
        String s = "a";
        boolean actual = sut.palindrome(s);
        Assert.assertEquals(true, actual);
    }

    @Test
    public void test3(){
        String s = "ab";
        boolean actual = sut.palindrome(s);
        Assert.assertEquals(false, actual);
    }

    @Test
    public void test4(){
        String s = "";
        boolean actual = sut.recursive(s);
        Assert.assertEquals(true, actual);
    }

    @Test
    public void test5(){
        String s = "a";
        boolean actual = sut.recursive(s);
        Assert.assertEquals(true, actual);
    }

    @Test
    public void test6(){
        String s = "ab";
        boolean actual = sut.recursive(s);
        Assert.assertEquals(false, actual);
    }

    @Test
    public void test7(){
        String s = "fdafasfefq";
        boolean actual = sut.recursive(s);
        Assert.assertEquals(false, actual);
    }

    @Test
    public void test8(){
        String s = "ababa";
        boolean actual = sut.recursive(s);
        Assert.assertEquals(true, actual);
    }

}
