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
        int[] a = {0, 1, 2};
        int actual = sut.binarySearch(a, 2);

        Assert.assertEquals(2, actual);
    }

    @Test
    public void test3(){
        int[] a = {0, 1, 2, 6, 9, 10};
        int actual = sut.binarySearch(a, 9);

        Assert.assertEquals(4, actual);
    }

    @Test
    public void test4(){
        int[] a = {0, 1, 2, 6, 9, 10, 11};
        int actual = sut.binarySearch(a, 0);

        Assert.assertEquals(0, actual);
    }

    @Test
    public void test5(){
        int[] a = {0, 1, 2, 6, 9, 10, 11};
        int actual = sut.binarySearch(a, 11);

        Assert.assertEquals(6, actual);
    }

}
