import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinarySearchTest {
    private static BinarySearch sut;

    @BeforeClass
    public static void init(){
        sut = new BinarySearch();
    }

    @Test
    public void test1(){
        int[] a = {1};
        int actual = sut.binarySearch(a, 1);

        Assert.assertEquals(0, actual);
    }

    @Test
    public void test2(){
        int[] a = {1, 2};
        int actual = sut.binarySearch(a, 1);

        Assert.assertEquals(1, actual);
    }
}
