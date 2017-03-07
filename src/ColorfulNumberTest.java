import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Daniel on 3/7/2017.
 */
public class ColorfulNumberTest {
    private static ColorfulNumber sut;

    @BeforeClass
    public static void init(){
        sut = new ColorfulNumber();
    }

    @Test
    public void test1(){
        int actual = sut.colorful(1);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void test2(){
        int actual = sut.colorful(11);
        Assert.assertEquals(0, actual);
    }

    @Test
    public void test3(){
        int actual = sut.colorful(3245);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void test4(){
        int actual = sut.colorful(3345);
        Assert.assertEquals(0, actual);
    }

    //todo: test fails 
    @Test
    public void test5(){
        int actual = sut.colorful(123);
        Assert.assertEquals(0, actual);
    }
}
