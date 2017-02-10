import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;

/**
 * Created by Daniel on 2/7/2017.
 */
public class ReverseLinkedListTest {
    private static ReverseLinkedList sut;

    @BeforeClass
    public static void init(){
        sut = new ReverseLinkedList();
    }

    @Test
    public void test1(){
        ListNode node = new ListNode(1);
        ListNode actual = sut.reverseList(node);
        Assert.assertEquals(node.toList(), actual.toList());
    }

    @Test
    public void test2(){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        ArrayList expected = new ArrayList(asList(2, 1));
        ListNode actual = sut.reverseList(node);

        Assert.assertEquals(expected, actual.toList());
    }

    @Test
    public void test3(){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        ArrayList expected = new ArrayList(asList(2, 1));
        ListNode actual = sut.reverseList(node);

        Assert.assertEquals(expected, actual.toList());
    }

    @Test
    public void test4(){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);

        ArrayList expected = new ArrayList(asList(3, 2, 1));
        ListNode actual = sut.reverseList(node);

        Assert.assertEquals(expected, actual.toList());
    }
}
