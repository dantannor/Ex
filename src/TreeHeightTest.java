import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by Daniel on 2/6/2017.
 */
public class TreeHeightTest {
    private static TreeHeight sut;

    @BeforeClass
    public static void init(){
        sut = new TreeHeight();
    }

    @Test
    public void test1(){
        TreeNode node = new TreeNode(0);

        List<Integer> expected = new ArrayList<>(asList(0));
        List<Integer> actual = sut.getHeightRoute(node);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);

        List<Integer> expected = new ArrayList<>(asList(1, 0));
        List<Integer> actual = sut.getHeightRoute(node);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);

        List<Integer> expected = new ArrayList<>(asList(1, 0));
        List<Integer> actual = sut.getHeightRoute(node);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.left.left = new TreeNode(2);

        List<Integer> expected = new ArrayList<>(asList(2, 1, 0));
        List<Integer> actual = sut.getHeightRoute(node);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.left.right = new TreeNode(2);

        List<Integer> expected = new ArrayList<>(asList(2, 1, 0));
        List<Integer> actual = sut.getHeightRoute(node);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test6(){
        List<Integer> expected = new ArrayList<>(asList());
        List<Integer> actual = sut.getHeightRoute(null);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test7(){
        TreeNode node = new TreeNode(0);
        node.right = new TreeNode(1);
        node.right.left = new TreeNode(2);
        node.left = new TreeNode(4);

        List<Integer> expected = new ArrayList<>(asList(2, 1, 0));
        List<Integer> actual = sut.getHeightRoute(node);
        Assert.assertEquals(expected, actual);
    }
}
