import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Daniel on 2/5/2017.
 */
public class ReverseTest {
    private static Reverse sut;

    @BeforeClass
    public static void init(){
        sut = new Reverse();
    }

    @Test
    public void test1(){
        String s = "";
        String actual = sut.reverseWords(s);

        Assert.assertEquals("", actual);
    }

    @Test
    public void test2(){
        String s = "a";
        String actual = sut.reverseWords(s);

        Assert.assertEquals("a", actual);
    }

    @Test
    public void test3(){
        String s = "a";
        String actual = sut.reverseWords(s);

        Assert.assertEquals("a", actual);
    }

    @Test
    public void test4(){
        String s = "the sky is blue";
        String actual = sut.reverseWords(s);

        Assert.assertEquals("blue is sky the", actual);
    }
}
