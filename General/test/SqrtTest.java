import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Daniel on 31-Jan-17.
 */
public class SqrtTest {
    private static Sqrt sut;

    @BeforeClass
    public static void init(){
        sut = new Sqrt();
    }

    @Test
    public void test1(){
        int a = 9;
        int actual = sut.sqrt(a);
        Assert.assertEquals(3, actual);
    }

    @Test
    public void test2(){
        int a = 10;
        int actual = sut.sqrt(a);
        Assert.assertEquals(3, actual);
    }

    @Test
    public void test3(){
        int a = 64;
        int actual = sut.sqrt(a);
        Assert.assertEquals(8, actual);
    }

    @Test
    public void test4(){
        int a = 67;
        int actual = sut.sqrt(a);
        Assert.assertEquals(8, actual);
    }

    @Test
    public void test5(){
        int a = 2;
        int actual = sut.sqrt(a);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void test6(){
        int a = 3;
        int actual = sut.sqrt(a);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void test7(){
        int a = 4;
        int actual = sut.sqrt(a);
        Assert.assertEquals(2, actual);
    }

    @Test
    public void test8(){
        int a = 6;
        int actual = sut.sqrt(a);
        Assert.assertEquals(2, actual);
    }
}
