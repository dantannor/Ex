
import Lists.MyArrayList;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by Daniel on 29-Dec-16.
 */
public class MyArrayListTest {

    private static MyArrayList sut;

//    @BeforeClass
//    public static void setUp() {
//        sut = new MyArrayList();
//
//    }

    @BeforeEach
    void setUpEach() {
        sut = new MyArrayList();
    }

    @Test
    public void add(){
        sut.add(1);

        Assert.assertEquals(1, sut.length);
    }

    @Test
    public void remove(){
        sut.add(1);
        sut.add(2);
        sut.add(3);
        sut.remove(0);

        Assert.assertEquals(3, (int)sut.get(1));
    }
}
