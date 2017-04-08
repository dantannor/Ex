import Lists.ListNode;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;

/**
 * Created by Daniel on 2/7/2017.
 */
public class ListNodeTest {
    private static ListNode sut;

    @BeforeClass
    public static void init(){
        sut = new ListNode(1);
    }

    @Test
    public void test1(){
        ArrayList expected = new ArrayList(asList(1));
        Assert.assertEquals(expected, sut.toList());
    }

    @Test
    public void test2(){
        sut.next = new ListNode(2);
        ArrayList expected = new ArrayList(asList(1, 2));
        Assert.assertEquals(expected, sut.toList());
    }
}
